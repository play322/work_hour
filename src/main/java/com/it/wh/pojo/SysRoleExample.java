package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andSrNameIsNull() {
            addCriterion("sr_name is null");
            return (Criteria) this;
        }

        public Criteria andSrNameIsNotNull() {
            addCriterion("sr_name is not null");
            return (Criteria) this;
        }

        public Criteria andSrNameEqualTo(String value) {
            addCriterion("sr_name =", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotEqualTo(String value) {
            addCriterion("sr_name <>", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameGreaterThan(String value) {
            addCriterion("sr_name >", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameGreaterThanOrEqualTo(String value) {
            addCriterion("sr_name >=", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameLessThan(String value) {
            addCriterion("sr_name <", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameLessThanOrEqualTo(String value) {
            addCriterion("sr_name <=", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameLike(String value) {
            addCriterion("sr_name like", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotLike(String value) {
            addCriterion("sr_name not like", value, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameIn(List<String> values) {
            addCriterion("sr_name in", values, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotIn(List<String> values) {
            addCriterion("sr_name not in", values, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameBetween(String value1, String value2) {
            addCriterion("sr_name between", value1, value2, "srName");
            return (Criteria) this;
        }

        public Criteria andSrNameNotBetween(String value1, String value2) {
            addCriterion("sr_name not between", value1, value2, "srName");
            return (Criteria) this;
        }

        public Criteria andSrSignIsNull() {
            addCriterion("sr_sign is null");
            return (Criteria) this;
        }

        public Criteria andSrSignIsNotNull() {
            addCriterion("sr_sign is not null");
            return (Criteria) this;
        }

        public Criteria andSrSignEqualTo(String value) {
            addCriterion("sr_sign =", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignNotEqualTo(String value) {
            addCriterion("sr_sign <>", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignGreaterThan(String value) {
            addCriterion("sr_sign >", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignGreaterThanOrEqualTo(String value) {
            addCriterion("sr_sign >=", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignLessThan(String value) {
            addCriterion("sr_sign <", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignLessThanOrEqualTo(String value) {
            addCriterion("sr_sign <=", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignLike(String value) {
            addCriterion("sr_sign like", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignNotLike(String value) {
            addCriterion("sr_sign not like", value, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignIn(List<String> values) {
            addCriterion("sr_sign in", values, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignNotIn(List<String> values) {
            addCriterion("sr_sign not in", values, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignBetween(String value1, String value2) {
            addCriterion("sr_sign between", value1, value2, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrSignNotBetween(String value1, String value2) {
            addCriterion("sr_sign not between", value1, value2, "srSign");
            return (Criteria) this;
        }

        public Criteria andSrRemarkIsNull() {
            addCriterion("sr_remark is null");
            return (Criteria) this;
        }

        public Criteria andSrRemarkIsNotNull() {
            addCriterion("sr_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSrRemarkEqualTo(String value) {
            addCriterion("sr_remark =", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkNotEqualTo(String value) {
            addCriterion("sr_remark <>", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkGreaterThan(String value) {
            addCriterion("sr_remark >", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sr_remark >=", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkLessThan(String value) {
            addCriterion("sr_remark <", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkLessThanOrEqualTo(String value) {
            addCriterion("sr_remark <=", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkLike(String value) {
            addCriterion("sr_remark like", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkNotLike(String value) {
            addCriterion("sr_remark not like", value, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkIn(List<String> values) {
            addCriterion("sr_remark in", values, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkNotIn(List<String> values) {
            addCriterion("sr_remark not in", values, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkBetween(String value1, String value2) {
            addCriterion("sr_remark between", value1, value2, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrRemarkNotBetween(String value1, String value2) {
            addCriterion("sr_remark not between", value1, value2, "srRemark");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidIsNull() {
            addCriterion("sr_create_uid is null");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidIsNotNull() {
            addCriterion("sr_create_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidEqualTo(Long value) {
            addCriterion("sr_create_uid =", value, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidNotEqualTo(Long value) {
            addCriterion("sr_create_uid <>", value, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidGreaterThan(Long value) {
            addCriterion("sr_create_uid >", value, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("sr_create_uid >=", value, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidLessThan(Long value) {
            addCriterion("sr_create_uid <", value, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidLessThanOrEqualTo(Long value) {
            addCriterion("sr_create_uid <=", value, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidIn(List<Long> values) {
            addCriterion("sr_create_uid in", values, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidNotIn(List<Long> values) {
            addCriterion("sr_create_uid not in", values, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidBetween(Long value1, Long value2) {
            addCriterion("sr_create_uid between", value1, value2, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateUidNotBetween(Long value1, Long value2) {
            addCriterion("sr_create_uid not between", value1, value2, "srCreateUid");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtIsNull() {
            addCriterion("sr_create_dt is null");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtIsNotNull() {
            addCriterion("sr_create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtEqualTo(Date value) {
            addCriterion("sr_create_dt =", value, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtNotEqualTo(Date value) {
            addCriterion("sr_create_dt <>", value, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtGreaterThan(Date value) {
            addCriterion("sr_create_dt >", value, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sr_create_dt >=", value, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtLessThan(Date value) {
            addCriterion("sr_create_dt <", value, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("sr_create_dt <=", value, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtIn(List<Date> values) {
            addCriterion("sr_create_dt in", values, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtNotIn(List<Date> values) {
            addCriterion("sr_create_dt not in", values, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtBetween(Date value1, Date value2) {
            addCriterion("sr_create_dt between", value1, value2, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("sr_create_dt not between", value1, value2, "srCreateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtIsNull() {
            addCriterion("sr_update_dt is null");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtIsNotNull() {
            addCriterion("sr_update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtEqualTo(Date value) {
            addCriterion("sr_update_dt =", value, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtNotEqualTo(Date value) {
            addCriterion("sr_update_dt <>", value, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtGreaterThan(Date value) {
            addCriterion("sr_update_dt >", value, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sr_update_dt >=", value, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtLessThan(Date value) {
            addCriterion("sr_update_dt <", value, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtLessThanOrEqualTo(Date value) {
            addCriterion("sr_update_dt <=", value, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtIn(List<Date> values) {
            addCriterion("sr_update_dt in", values, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtNotIn(List<Date> values) {
            addCriterion("sr_update_dt not in", values, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtBetween(Date value1, Date value2) {
            addCriterion("sr_update_dt between", value1, value2, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateDtNotBetween(Date value1, Date value2) {
            addCriterion("sr_update_dt not between", value1, value2, "srUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidIsNull() {
            addCriterion("sr_update_uid is null");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidIsNotNull() {
            addCriterion("sr_update_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidEqualTo(Long value) {
            addCriterion("sr_update_uid =", value, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidNotEqualTo(Long value) {
            addCriterion("sr_update_uid <>", value, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidGreaterThan(Long value) {
            addCriterion("sr_update_uid >", value, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("sr_update_uid >=", value, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidLessThan(Long value) {
            addCriterion("sr_update_uid <", value, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidLessThanOrEqualTo(Long value) {
            addCriterion("sr_update_uid <=", value, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidIn(List<Long> values) {
            addCriterion("sr_update_uid in", values, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidNotIn(List<Long> values) {
            addCriterion("sr_update_uid not in", values, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidBetween(Long value1, Long value2) {
            addCriterion("sr_update_uid between", value1, value2, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrUpdateUidNotBetween(Long value1, Long value2) {
            addCriterion("sr_update_uid not between", value1, value2, "srUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminIsNull() {
            addCriterion("sr_issuperadmin is null");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminIsNotNull() {
            addCriterion("sr_issuperadmin is not null");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminEqualTo(String value) {
            addCriterion("sr_issuperadmin =", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminNotEqualTo(String value) {
            addCriterion("sr_issuperadmin <>", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminGreaterThan(String value) {
            addCriterion("sr_issuperadmin >", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminGreaterThanOrEqualTo(String value) {
            addCriterion("sr_issuperadmin >=", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminLessThan(String value) {
            addCriterion("sr_issuperadmin <", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminLessThanOrEqualTo(String value) {
            addCriterion("sr_issuperadmin <=", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminLike(String value) {
            addCriterion("sr_issuperadmin like", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminNotLike(String value) {
            addCriterion("sr_issuperadmin not like", value, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminIn(List<String> values) {
            addCriterion("sr_issuperadmin in", values, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminNotIn(List<String> values) {
            addCriterion("sr_issuperadmin not in", values, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminBetween(String value1, String value2) {
            addCriterion("sr_issuperadmin between", value1, value2, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssuperadminNotBetween(String value1, String value2) {
            addCriterion("sr_issuperadmin not between", value1, value2, "srIssuperadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminIsNull() {
            addCriterion("sr_issysadmin is null");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminIsNotNull() {
            addCriterion("sr_issysadmin is not null");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminEqualTo(String value) {
            addCriterion("sr_issysadmin =", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminNotEqualTo(String value) {
            addCriterion("sr_issysadmin <>", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminGreaterThan(String value) {
            addCriterion("sr_issysadmin >", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminGreaterThanOrEqualTo(String value) {
            addCriterion("sr_issysadmin >=", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminLessThan(String value) {
            addCriterion("sr_issysadmin <", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminLessThanOrEqualTo(String value) {
            addCriterion("sr_issysadmin <=", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminLike(String value) {
            addCriterion("sr_issysadmin like", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminNotLike(String value) {
            addCriterion("sr_issysadmin not like", value, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminIn(List<String> values) {
            addCriterion("sr_issysadmin in", values, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminNotIn(List<String> values) {
            addCriterion("sr_issysadmin not in", values, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminBetween(String value1, String value2) {
            addCriterion("sr_issysadmin between", value1, value2, "srIssysadmin");
            return (Criteria) this;
        }

        public Criteria andSrIssysadminNotBetween(String value1, String value2) {
            addCriterion("sr_issysadmin not between", value1, value2, "srIssysadmin");
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