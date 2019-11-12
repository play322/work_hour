package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPiNameIsNull() {
            addCriterion("pi_name is null");
            return (Criteria) this;
        }

        public Criteria andPiNameIsNotNull() {
            addCriterion("pi_name is not null");
            return (Criteria) this;
        }

        public Criteria andPiNameEqualTo(String value) {
            addCriterion("pi_name =", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotEqualTo(String value) {
            addCriterion("pi_name <>", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameGreaterThan(String value) {
            addCriterion("pi_name >", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameGreaterThanOrEqualTo(String value) {
            addCriterion("pi_name >=", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLessThan(String value) {
            addCriterion("pi_name <", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLessThanOrEqualTo(String value) {
            addCriterion("pi_name <=", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameLike(String value) {
            addCriterion("pi_name like", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotLike(String value) {
            addCriterion("pi_name not like", value, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameIn(List<String> values) {
            addCriterion("pi_name in", values, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotIn(List<String> values) {
            addCriterion("pi_name not in", values, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameBetween(String value1, String value2) {
            addCriterion("pi_name between", value1, value2, "piName");
            return (Criteria) this;
        }

        public Criteria andPiNameNotBetween(String value1, String value2) {
            addCriterion("pi_name not between", value1, value2, "piName");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentIsNull() {
            addCriterion("pi_department is null");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentIsNotNull() {
            addCriterion("pi_department is not null");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentEqualTo(String value) {
            addCriterion("pi_department =", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentNotEqualTo(String value) {
            addCriterion("pi_department <>", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentGreaterThan(String value) {
            addCriterion("pi_department >", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("pi_department >=", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentLessThan(String value) {
            addCriterion("pi_department <", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentLessThanOrEqualTo(String value) {
            addCriterion("pi_department <=", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentLike(String value) {
            addCriterion("pi_department like", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentNotLike(String value) {
            addCriterion("pi_department not like", value, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentIn(List<String> values) {
            addCriterion("pi_department in", values, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentNotIn(List<String> values) {
            addCriterion("pi_department not in", values, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentBetween(String value1, String value2) {
            addCriterion("pi_department between", value1, value2, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiDepartmentNotBetween(String value1, String value2) {
            addCriterion("pi_department not between", value1, value2, "piDepartment");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdIsNull() {
            addCriterion("pi_create_id is null");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdIsNotNull() {
            addCriterion("pi_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdEqualTo(Long value) {
            addCriterion("pi_create_id =", value, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdNotEqualTo(Long value) {
            addCriterion("pi_create_id <>", value, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdGreaterThan(Long value) {
            addCriterion("pi_create_id >", value, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pi_create_id >=", value, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdLessThan(Long value) {
            addCriterion("pi_create_id <", value, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("pi_create_id <=", value, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdIn(List<Long> values) {
            addCriterion("pi_create_id in", values, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdNotIn(List<Long> values) {
            addCriterion("pi_create_id not in", values, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdBetween(Long value1, Long value2) {
            addCriterion("pi_create_id between", value1, value2, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("pi_create_id not between", value1, value2, "piCreateId");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtIsNull() {
            addCriterion("pi_create_dt is null");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtIsNotNull() {
            addCriterion("pi_create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtEqualTo(Date value) {
            addCriterion("pi_create_dt =", value, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtNotEqualTo(Date value) {
            addCriterion("pi_create_dt <>", value, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtGreaterThan(Date value) {
            addCriterion("pi_create_dt >", value, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_create_dt >=", value, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtLessThan(Date value) {
            addCriterion("pi_create_dt <", value, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("pi_create_dt <=", value, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtIn(List<Date> values) {
            addCriterion("pi_create_dt in", values, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtNotIn(List<Date> values) {
            addCriterion("pi_create_dt not in", values, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtBetween(Date value1, Date value2) {
            addCriterion("pi_create_dt between", value1, value2, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("pi_create_dt not between", value1, value2, "piCreateDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtIsNull() {
            addCriterion("pi_plan_start_dt is null");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtIsNotNull() {
            addCriterion("pi_plan_start_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtEqualTo(Date value) {
            addCriterion("pi_plan_start_dt =", value, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtNotEqualTo(Date value) {
            addCriterion("pi_plan_start_dt <>", value, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtGreaterThan(Date value) {
            addCriterion("pi_plan_start_dt >", value, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_plan_start_dt >=", value, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtLessThan(Date value) {
            addCriterion("pi_plan_start_dt <", value, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtLessThanOrEqualTo(Date value) {
            addCriterion("pi_plan_start_dt <=", value, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtIn(List<Date> values) {
            addCriterion("pi_plan_start_dt in", values, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtNotIn(List<Date> values) {
            addCriterion("pi_plan_start_dt not in", values, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtBetween(Date value1, Date value2) {
            addCriterion("pi_plan_start_dt between", value1, value2, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanStartDtNotBetween(Date value1, Date value2) {
            addCriterion("pi_plan_start_dt not between", value1, value2, "piPlanStartDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtIsNull() {
            addCriterion("pi_plan_end_dt is null");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtIsNotNull() {
            addCriterion("pi_plan_end_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtEqualTo(Date value) {
            addCriterion("pi_plan_end_dt =", value, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtNotEqualTo(Date value) {
            addCriterion("pi_plan_end_dt <>", value, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtGreaterThan(Date value) {
            addCriterion("pi_plan_end_dt >", value, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_plan_end_dt >=", value, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtLessThan(Date value) {
            addCriterion("pi_plan_end_dt <", value, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtLessThanOrEqualTo(Date value) {
            addCriterion("pi_plan_end_dt <=", value, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtIn(List<Date> values) {
            addCriterion("pi_plan_end_dt in", values, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtNotIn(List<Date> values) {
            addCriterion("pi_plan_end_dt not in", values, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtBetween(Date value1, Date value2) {
            addCriterion("pi_plan_end_dt between", value1, value2, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiPlanEndDtNotBetween(Date value1, Date value2) {
            addCriterion("pi_plan_end_dt not between", value1, value2, "piPlanEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtIsNull() {
            addCriterion("pi_real_start_dt is null");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtIsNotNull() {
            addCriterion("pi_real_start_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtEqualTo(Date value) {
            addCriterion("pi_real_start_dt =", value, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtNotEqualTo(Date value) {
            addCriterion("pi_real_start_dt <>", value, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtGreaterThan(Date value) {
            addCriterion("pi_real_start_dt >", value, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_real_start_dt >=", value, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtLessThan(Date value) {
            addCriterion("pi_real_start_dt <", value, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtLessThanOrEqualTo(Date value) {
            addCriterion("pi_real_start_dt <=", value, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtIn(List<Date> values) {
            addCriterion("pi_real_start_dt in", values, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtNotIn(List<Date> values) {
            addCriterion("pi_real_start_dt not in", values, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtBetween(Date value1, Date value2) {
            addCriterion("pi_real_start_dt between", value1, value2, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealStartDtNotBetween(Date value1, Date value2) {
            addCriterion("pi_real_start_dt not between", value1, value2, "piRealStartDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtIsNull() {
            addCriterion("pi_real_end_dt is null");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtIsNotNull() {
            addCriterion("pi_real_end_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtEqualTo(Date value) {
            addCriterion("pi_real_end_dt =", value, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtNotEqualTo(Date value) {
            addCriterion("pi_real_end_dt <>", value, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtGreaterThan(Date value) {
            addCriterion("pi_real_end_dt >", value, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pi_real_end_dt >=", value, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtLessThan(Date value) {
            addCriterion("pi_real_end_dt <", value, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtLessThanOrEqualTo(Date value) {
            addCriterion("pi_real_end_dt <=", value, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtIn(List<Date> values) {
            addCriterion("pi_real_end_dt in", values, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtNotIn(List<Date> values) {
            addCriterion("pi_real_end_dt not in", values, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtBetween(Date value1, Date value2) {
            addCriterion("pi_real_end_dt between", value1, value2, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiRealEndDtNotBetween(Date value1, Date value2) {
            addCriterion("pi_real_end_dt not between", value1, value2, "piRealEndDt");
            return (Criteria) this;
        }

        public Criteria andPiStateIsNull() {
            addCriterion("pi_state is null");
            return (Criteria) this;
        }

        public Criteria andPiStateIsNotNull() {
            addCriterion("pi_state is not null");
            return (Criteria) this;
        }

        public Criteria andPiStateEqualTo(Byte value) {
            addCriterion("pi_state =", value, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateNotEqualTo(Byte value) {
            addCriterion("pi_state <>", value, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateGreaterThan(Byte value) {
            addCriterion("pi_state >", value, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("pi_state >=", value, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateLessThan(Byte value) {
            addCriterion("pi_state <", value, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateLessThanOrEqualTo(Byte value) {
            addCriterion("pi_state <=", value, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateIn(List<Byte> values) {
            addCriterion("pi_state in", values, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateNotIn(List<Byte> values) {
            addCriterion("pi_state not in", values, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateBetween(Byte value1, Byte value2) {
            addCriterion("pi_state between", value1, value2, "piState");
            return (Criteria) this;
        }

        public Criteria andPiStateNotBetween(Byte value1, Byte value2) {
            addCriterion("pi_state not between", value1, value2, "piState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}