package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDictExample() {
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

        public Criteria andSdNameIsNull() {
            addCriterion("sd_name is null");
            return (Criteria) this;
        }

        public Criteria andSdNameIsNotNull() {
            addCriterion("sd_name is not null");
            return (Criteria) this;
        }

        public Criteria andSdNameEqualTo(String value) {
            addCriterion("sd_name =", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotEqualTo(String value) {
            addCriterion("sd_name <>", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThan(String value) {
            addCriterion("sd_name >", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameGreaterThanOrEqualTo(String value) {
            addCriterion("sd_name >=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThan(String value) {
            addCriterion("sd_name <", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLessThanOrEqualTo(String value) {
            addCriterion("sd_name <=", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameLike(String value) {
            addCriterion("sd_name like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotLike(String value) {
            addCriterion("sd_name not like", value, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameIn(List<String> values) {
            addCriterion("sd_name in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotIn(List<String> values) {
            addCriterion("sd_name not in", values, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameBetween(String value1, String value2) {
            addCriterion("sd_name between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdNameNotBetween(String value1, String value2) {
            addCriterion("sd_name not between", value1, value2, "sdName");
            return (Criteria) this;
        }

        public Criteria andSdValueIsNull() {
            addCriterion("sd_value is null");
            return (Criteria) this;
        }

        public Criteria andSdValueIsNotNull() {
            addCriterion("sd_value is not null");
            return (Criteria) this;
        }

        public Criteria andSdValueEqualTo(String value) {
            addCriterion("sd_value =", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueNotEqualTo(String value) {
            addCriterion("sd_value <>", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueGreaterThan(String value) {
            addCriterion("sd_value >", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueGreaterThanOrEqualTo(String value) {
            addCriterion("sd_value >=", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueLessThan(String value) {
            addCriterion("sd_value <", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueLessThanOrEqualTo(String value) {
            addCriterion("sd_value <=", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueLike(String value) {
            addCriterion("sd_value like", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueNotLike(String value) {
            addCriterion("sd_value not like", value, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueIn(List<String> values) {
            addCriterion("sd_value in", values, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueNotIn(List<String> values) {
            addCriterion("sd_value not in", values, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueBetween(String value1, String value2) {
            addCriterion("sd_value between", value1, value2, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdValueNotBetween(String value1, String value2) {
            addCriterion("sd_value not between", value1, value2, "sdValue");
            return (Criteria) this;
        }

        public Criteria andSdTypeIsNull() {
            addCriterion("sd_type is null");
            return (Criteria) this;
        }

        public Criteria andSdTypeIsNotNull() {
            addCriterion("sd_type is not null");
            return (Criteria) this;
        }

        public Criteria andSdTypeEqualTo(String value) {
            addCriterion("sd_type =", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeNotEqualTo(String value) {
            addCriterion("sd_type <>", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeGreaterThan(String value) {
            addCriterion("sd_type >", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sd_type >=", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeLessThan(String value) {
            addCriterion("sd_type <", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeLessThanOrEqualTo(String value) {
            addCriterion("sd_type <=", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeLike(String value) {
            addCriterion("sd_type like", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeNotLike(String value) {
            addCriterion("sd_type not like", value, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeIn(List<String> values) {
            addCriterion("sd_type in", values, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeNotIn(List<String> values) {
            addCriterion("sd_type not in", values, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeBetween(String value1, String value2) {
            addCriterion("sd_type between", value1, value2, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdTypeNotBetween(String value1, String value2) {
            addCriterion("sd_type not between", value1, value2, "sdType");
            return (Criteria) this;
        }

        public Criteria andSdDescIsNull() {
            addCriterion("sd_desc is null");
            return (Criteria) this;
        }

        public Criteria andSdDescIsNotNull() {
            addCriterion("sd_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSdDescEqualTo(String value) {
            addCriterion("sd_desc =", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescNotEqualTo(String value) {
            addCriterion("sd_desc <>", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescGreaterThan(String value) {
            addCriterion("sd_desc >", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescGreaterThanOrEqualTo(String value) {
            addCriterion("sd_desc >=", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescLessThan(String value) {
            addCriterion("sd_desc <", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescLessThanOrEqualTo(String value) {
            addCriterion("sd_desc <=", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescLike(String value) {
            addCriterion("sd_desc like", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescNotLike(String value) {
            addCriterion("sd_desc not like", value, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescIn(List<String> values) {
            addCriterion("sd_desc in", values, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescNotIn(List<String> values) {
            addCriterion("sd_desc not in", values, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescBetween(String value1, String value2) {
            addCriterion("sd_desc between", value1, value2, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdDescNotBetween(String value1, String value2) {
            addCriterion("sd_desc not between", value1, value2, "sdDesc");
            return (Criteria) this;
        }

        public Criteria andSdOrderIsNull() {
            addCriterion("sd_order is null");
            return (Criteria) this;
        }

        public Criteria andSdOrderIsNotNull() {
            addCriterion("sd_order is not null");
            return (Criteria) this;
        }

        public Criteria andSdOrderEqualTo(Integer value) {
            addCriterion("sd_order =", value, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderNotEqualTo(Integer value) {
            addCriterion("sd_order <>", value, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderGreaterThan(Integer value) {
            addCriterion("sd_order >", value, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sd_order >=", value, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderLessThan(Integer value) {
            addCriterion("sd_order <", value, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sd_order <=", value, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderIn(List<Integer> values) {
            addCriterion("sd_order in", values, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderNotIn(List<Integer> values) {
            addCriterion("sd_order not in", values, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderBetween(Integer value1, Integer value2) {
            addCriterion("sd_order between", value1, value2, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sd_order not between", value1, value2, "sdOrder");
            return (Criteria) this;
        }

        public Criteria andSdParentIdIsNull() {
            addCriterion("sd_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andSdParentIdIsNotNull() {
            addCriterion("sd_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSdParentIdEqualTo(Long value) {
            addCriterion("sd_parent_id =", value, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdNotEqualTo(Long value) {
            addCriterion("sd_parent_id <>", value, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdGreaterThan(Long value) {
            addCriterion("sd_parent_id >", value, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sd_parent_id >=", value, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdLessThan(Long value) {
            addCriterion("sd_parent_id <", value, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdLessThanOrEqualTo(Long value) {
            addCriterion("sd_parent_id <=", value, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdIn(List<Long> values) {
            addCriterion("sd_parent_id in", values, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdNotIn(List<Long> values) {
            addCriterion("sd_parent_id not in", values, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdBetween(Long value1, Long value2) {
            addCriterion("sd_parent_id between", value1, value2, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdParentIdNotBetween(Long value1, Long value2) {
            addCriterion("sd_parent_id not between", value1, value2, "sdParentId");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidIsNull() {
            addCriterion("sd_create_uid is null");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidIsNotNull() {
            addCriterion("sd_create_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidEqualTo(Long value) {
            addCriterion("sd_create_uid =", value, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidNotEqualTo(Long value) {
            addCriterion("sd_create_uid <>", value, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidGreaterThan(Long value) {
            addCriterion("sd_create_uid >", value, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("sd_create_uid >=", value, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidLessThan(Long value) {
            addCriterion("sd_create_uid <", value, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidLessThanOrEqualTo(Long value) {
            addCriterion("sd_create_uid <=", value, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidIn(List<Long> values) {
            addCriterion("sd_create_uid in", values, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidNotIn(List<Long> values) {
            addCriterion("sd_create_uid not in", values, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidBetween(Long value1, Long value2) {
            addCriterion("sd_create_uid between", value1, value2, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateUidNotBetween(Long value1, Long value2) {
            addCriterion("sd_create_uid not between", value1, value2, "sdCreateUid");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtIsNull() {
            addCriterion("sd_create_dt is null");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtIsNotNull() {
            addCriterion("sd_create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtEqualTo(Date value) {
            addCriterion("sd_create_dt =", value, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtNotEqualTo(Date value) {
            addCriterion("sd_create_dt <>", value, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtGreaterThan(Date value) {
            addCriterion("sd_create_dt >", value, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sd_create_dt >=", value, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtLessThan(Date value) {
            addCriterion("sd_create_dt <", value, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("sd_create_dt <=", value, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtIn(List<Date> values) {
            addCriterion("sd_create_dt in", values, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtNotIn(List<Date> values) {
            addCriterion("sd_create_dt not in", values, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtBetween(Date value1, Date value2) {
            addCriterion("sd_create_dt between", value1, value2, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("sd_create_dt not between", value1, value2, "sdCreateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidIsNull() {
            addCriterion("sd_update_uid is null");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidIsNotNull() {
            addCriterion("sd_update_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidEqualTo(Long value) {
            addCriterion("sd_update_uid =", value, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidNotEqualTo(Long value) {
            addCriterion("sd_update_uid <>", value, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidGreaterThan(Long value) {
            addCriterion("sd_update_uid >", value, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("sd_update_uid >=", value, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidLessThan(Long value) {
            addCriterion("sd_update_uid <", value, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidLessThanOrEqualTo(Long value) {
            addCriterion("sd_update_uid <=", value, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidIn(List<Long> values) {
            addCriterion("sd_update_uid in", values, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidNotIn(List<Long> values) {
            addCriterion("sd_update_uid not in", values, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidBetween(Long value1, Long value2) {
            addCriterion("sd_update_uid between", value1, value2, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateUidNotBetween(Long value1, Long value2) {
            addCriterion("sd_update_uid not between", value1, value2, "sdUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtIsNull() {
            addCriterion("sd_update_dt is null");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtIsNotNull() {
            addCriterion("sd_update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtEqualTo(Date value) {
            addCriterion("sd_update_dt =", value, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtNotEqualTo(Date value) {
            addCriterion("sd_update_dt <>", value, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtGreaterThan(Date value) {
            addCriterion("sd_update_dt >", value, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sd_update_dt >=", value, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtLessThan(Date value) {
            addCriterion("sd_update_dt <", value, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtLessThanOrEqualTo(Date value) {
            addCriterion("sd_update_dt <=", value, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtIn(List<Date> values) {
            addCriterion("sd_update_dt in", values, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtNotIn(List<Date> values) {
            addCriterion("sd_update_dt not in", values, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtBetween(Date value1, Date value2) {
            addCriterion("sd_update_dt between", value1, value2, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdUpdateDtNotBetween(Date value1, Date value2) {
            addCriterion("sd_update_dt not between", value1, value2, "sdUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSdRemarkIsNull() {
            addCriterion("sd_remark is null");
            return (Criteria) this;
        }

        public Criteria andSdRemarkIsNotNull() {
            addCriterion("sd_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSdRemarkEqualTo(String value) {
            addCriterion("sd_remark =", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotEqualTo(String value) {
            addCriterion("sd_remark <>", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkGreaterThan(String value) {
            addCriterion("sd_remark >", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sd_remark >=", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkLessThan(String value) {
            addCriterion("sd_remark <", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkLessThanOrEqualTo(String value) {
            addCriterion("sd_remark <=", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkLike(String value) {
            addCriterion("sd_remark like", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotLike(String value) {
            addCriterion("sd_remark not like", value, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkIn(List<String> values) {
            addCriterion("sd_remark in", values, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotIn(List<String> values) {
            addCriterion("sd_remark not in", values, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkBetween(String value1, String value2) {
            addCriterion("sd_remark between", value1, value2, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdRemarkNotBetween(String value1, String value2) {
            addCriterion("sd_remark not between", value1, value2, "sdRemark");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagIsNull() {
            addCriterion("sd_del_flag is null");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagIsNotNull() {
            addCriterion("sd_del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagEqualTo(String value) {
            addCriterion("sd_del_flag =", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagNotEqualTo(String value) {
            addCriterion("sd_del_flag <>", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagGreaterThan(String value) {
            addCriterion("sd_del_flag >", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("sd_del_flag >=", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagLessThan(String value) {
            addCriterion("sd_del_flag <", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagLessThanOrEqualTo(String value) {
            addCriterion("sd_del_flag <=", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagLike(String value) {
            addCriterion("sd_del_flag like", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagNotLike(String value) {
            addCriterion("sd_del_flag not like", value, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagIn(List<String> values) {
            addCriterion("sd_del_flag in", values, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagNotIn(List<String> values) {
            addCriterion("sd_del_flag not in", values, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagBetween(String value1, String value2) {
            addCriterion("sd_del_flag between", value1, value2, "sdDelFlag");
            return (Criteria) this;
        }

        public Criteria andSdDelFlagNotBetween(String value1, String value2) {
            addCriterion("sd_del_flag not between", value1, value2, "sdDelFlag");
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