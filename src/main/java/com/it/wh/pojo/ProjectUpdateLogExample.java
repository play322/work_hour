package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectUpdateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectUpdateLogExample() {
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

        public Criteria andPulPiIdIsNull() {
            addCriterion("pul_pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPulPiIdIsNotNull() {
            addCriterion("pul_pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPulPiIdEqualTo(Long value) {
            addCriterion("pul_pi_id =", value, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdNotEqualTo(Long value) {
            addCriterion("pul_pi_id <>", value, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdGreaterThan(Long value) {
            addCriterion("pul_pi_id >", value, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pul_pi_id >=", value, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdLessThan(Long value) {
            addCriterion("pul_pi_id <", value, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdLessThanOrEqualTo(Long value) {
            addCriterion("pul_pi_id <=", value, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdIn(List<Long> values) {
            addCriterion("pul_pi_id in", values, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdNotIn(List<Long> values) {
            addCriterion("pul_pi_id not in", values, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdBetween(Long value1, Long value2) {
            addCriterion("pul_pi_id between", value1, value2, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulPiIdNotBetween(Long value1, Long value2) {
            addCriterion("pul_pi_id not between", value1, value2, "pulPiId");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidIsNull() {
            addCriterion("pul_update_uid is null");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidIsNotNull() {
            addCriterion("pul_update_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidEqualTo(Long value) {
            addCriterion("pul_update_uid =", value, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidNotEqualTo(Long value) {
            addCriterion("pul_update_uid <>", value, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidGreaterThan(Long value) {
            addCriterion("pul_update_uid >", value, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("pul_update_uid >=", value, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidLessThan(Long value) {
            addCriterion("pul_update_uid <", value, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidLessThanOrEqualTo(Long value) {
            addCriterion("pul_update_uid <=", value, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidIn(List<Long> values) {
            addCriterion("pul_update_uid in", values, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidNotIn(List<Long> values) {
            addCriterion("pul_update_uid not in", values, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidBetween(Long value1, Long value2) {
            addCriterion("pul_update_uid between", value1, value2, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateUidNotBetween(Long value1, Long value2) {
            addCriterion("pul_update_uid not between", value1, value2, "pulUpdateUid");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtIsNull() {
            addCriterion("pul_update_dt is null");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtIsNotNull() {
            addCriterion("pul_update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtEqualTo(Date value) {
            addCriterion("pul_update_dt =", value, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtNotEqualTo(Date value) {
            addCriterion("pul_update_dt <>", value, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtGreaterThan(Date value) {
            addCriterion("pul_update_dt >", value, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("pul_update_dt >=", value, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtLessThan(Date value) {
            addCriterion("pul_update_dt <", value, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtLessThanOrEqualTo(Date value) {
            addCriterion("pul_update_dt <=", value, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtIn(List<Date> values) {
            addCriterion("pul_update_dt in", values, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtNotIn(List<Date> values) {
            addCriterion("pul_update_dt not in", values, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtBetween(Date value1, Date value2) {
            addCriterion("pul_update_dt between", value1, value2, "pulUpdateDt");
            return (Criteria) this;
        }

        public Criteria andPulUpdateDtNotBetween(Date value1, Date value2) {
            addCriterion("pul_update_dt not between", value1, value2, "pulUpdateDt");
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