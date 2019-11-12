package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectWorkHourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectWorkHourExample() {
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

        public Criteria andPuiPiIdIsNull() {
            addCriterion("pui_pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdIsNotNull() {
            addCriterion("pui_pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdEqualTo(Long value) {
            addCriterion("pui_pi_id =", value, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdNotEqualTo(Long value) {
            addCriterion("pui_pi_id <>", value, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdGreaterThan(Long value) {
            addCriterion("pui_pi_id >", value, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pui_pi_id >=", value, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdLessThan(Long value) {
            addCriterion("pui_pi_id <", value, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdLessThanOrEqualTo(Long value) {
            addCriterion("pui_pi_id <=", value, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdIn(List<Long> values) {
            addCriterion("pui_pi_id in", values, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdNotIn(List<Long> values) {
            addCriterion("pui_pi_id not in", values, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdBetween(Long value1, Long value2) {
            addCriterion("pui_pi_id between", value1, value2, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiPiIdNotBetween(Long value1, Long value2) {
            addCriterion("pui_pi_id not between", value1, value2, "puiPiId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdIsNull() {
            addCriterion("pui_su_id is null");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdIsNotNull() {
            addCriterion("pui_su_id is not null");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdEqualTo(Long value) {
            addCriterion("pui_su_id =", value, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdNotEqualTo(Long value) {
            addCriterion("pui_su_id <>", value, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdGreaterThan(Long value) {
            addCriterion("pui_su_id >", value, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pui_su_id >=", value, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdLessThan(Long value) {
            addCriterion("pui_su_id <", value, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdLessThanOrEqualTo(Long value) {
            addCriterion("pui_su_id <=", value, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdIn(List<Long> values) {
            addCriterion("pui_su_id in", values, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdNotIn(List<Long> values) {
            addCriterion("pui_su_id not in", values, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdBetween(Long value1, Long value2) {
            addCriterion("pui_su_id between", value1, value2, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiSuIdNotBetween(Long value1, Long value2) {
            addCriterion("pui_su_id not between", value1, value2, "puiSuId");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourIsNull() {
            addCriterion("pui_work_hour is null");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourIsNotNull() {
            addCriterion("pui_work_hour is not null");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourEqualTo(Long value) {
            addCriterion("pui_work_hour =", value, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourNotEqualTo(Long value) {
            addCriterion("pui_work_hour <>", value, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourGreaterThan(Long value) {
            addCriterion("pui_work_hour >", value, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourGreaterThanOrEqualTo(Long value) {
            addCriterion("pui_work_hour >=", value, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourLessThan(Long value) {
            addCriterion("pui_work_hour <", value, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourLessThanOrEqualTo(Long value) {
            addCriterion("pui_work_hour <=", value, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourIn(List<Long> values) {
            addCriterion("pui_work_hour in", values, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourNotIn(List<Long> values) {
            addCriterion("pui_work_hour not in", values, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourBetween(Long value1, Long value2) {
            addCriterion("pui_work_hour between", value1, value2, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiWorkHourNotBetween(Long value1, Long value2) {
            addCriterion("pui_work_hour not between", value1, value2, "puiWorkHour");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtIsNull() {
            addCriterion("pui_input_dt is null");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtIsNotNull() {
            addCriterion("pui_input_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtEqualTo(Date value) {
            addCriterion("pui_input_dt =", value, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtNotEqualTo(Date value) {
            addCriterion("pui_input_dt <>", value, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtGreaterThan(Date value) {
            addCriterion("pui_input_dt >", value, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pui_input_dt >=", value, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtLessThan(Date value) {
            addCriterion("pui_input_dt <", value, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtLessThanOrEqualTo(Date value) {
            addCriterion("pui_input_dt <=", value, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtIn(List<Date> values) {
            addCriterion("pui_input_dt in", values, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtNotIn(List<Date> values) {
            addCriterion("pui_input_dt not in", values, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtBetween(Date value1, Date value2) {
            addCriterion("pui_input_dt between", value1, value2, "puiInputDt");
            return (Criteria) this;
        }

        public Criteria andPuiInputDtNotBetween(Date value1, Date value2) {
            addCriterion("pui_input_dt not between", value1, value2, "puiInputDt");
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