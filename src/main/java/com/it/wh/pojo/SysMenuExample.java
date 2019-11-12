package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
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

        public Criteria andSmParentIdIsNull() {
            addCriterion("sm_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andSmParentIdIsNotNull() {
            addCriterion("sm_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmParentIdEqualTo(Long value) {
            addCriterion("sm_parent_id =", value, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdNotEqualTo(Long value) {
            addCriterion("sm_parent_id <>", value, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdGreaterThan(Long value) {
            addCriterion("sm_parent_id >", value, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_parent_id >=", value, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdLessThan(Long value) {
            addCriterion("sm_parent_id <", value, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdLessThanOrEqualTo(Long value) {
            addCriterion("sm_parent_id <=", value, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdIn(List<Long> values) {
            addCriterion("sm_parent_id in", values, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdNotIn(List<Long> values) {
            addCriterion("sm_parent_id not in", values, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdBetween(Long value1, Long value2) {
            addCriterion("sm_parent_id between", value1, value2, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmParentIdNotBetween(Long value1, Long value2) {
            addCriterion("sm_parent_id not between", value1, value2, "smParentId");
            return (Criteria) this;
        }

        public Criteria andSmNameIsNull() {
            addCriterion("sm_name is null");
            return (Criteria) this;
        }

        public Criteria andSmNameIsNotNull() {
            addCriterion("sm_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmNameEqualTo(String value) {
            addCriterion("sm_name =", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotEqualTo(String value) {
            addCriterion("sm_name <>", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameGreaterThan(String value) {
            addCriterion("sm_name >", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameGreaterThanOrEqualTo(String value) {
            addCriterion("sm_name >=", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameLessThan(String value) {
            addCriterion("sm_name <", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameLessThanOrEqualTo(String value) {
            addCriterion("sm_name <=", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameLike(String value) {
            addCriterion("sm_name like", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotLike(String value) {
            addCriterion("sm_name not like", value, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameIn(List<String> values) {
            addCriterion("sm_name in", values, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotIn(List<String> values) {
            addCriterion("sm_name not in", values, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameBetween(String value1, String value2) {
            addCriterion("sm_name between", value1, value2, "smName");
            return (Criteria) this;
        }

        public Criteria andSmNameNotBetween(String value1, String value2) {
            addCriterion("sm_name not between", value1, value2, "smName");
            return (Criteria) this;
        }

        public Criteria andSmUrlIsNull() {
            addCriterion("sm_url is null");
            return (Criteria) this;
        }

        public Criteria andSmUrlIsNotNull() {
            addCriterion("sm_url is not null");
            return (Criteria) this;
        }

        public Criteria andSmUrlEqualTo(String value) {
            addCriterion("sm_url =", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotEqualTo(String value) {
            addCriterion("sm_url <>", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlGreaterThan(String value) {
            addCriterion("sm_url >", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sm_url >=", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlLessThan(String value) {
            addCriterion("sm_url <", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlLessThanOrEqualTo(String value) {
            addCriterion("sm_url <=", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlLike(String value) {
            addCriterion("sm_url like", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotLike(String value) {
            addCriterion("sm_url not like", value, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlIn(List<String> values) {
            addCriterion("sm_url in", values, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotIn(List<String> values) {
            addCriterion("sm_url not in", values, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlBetween(String value1, String value2) {
            addCriterion("sm_url between", value1, value2, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmUrlNotBetween(String value1, String value2) {
            addCriterion("sm_url not between", value1, value2, "smUrl");
            return (Criteria) this;
        }

        public Criteria andSmPermsIsNull() {
            addCriterion("sm_perms is null");
            return (Criteria) this;
        }

        public Criteria andSmPermsIsNotNull() {
            addCriterion("sm_perms is not null");
            return (Criteria) this;
        }

        public Criteria andSmPermsEqualTo(String value) {
            addCriterion("sm_perms =", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsNotEqualTo(String value) {
            addCriterion("sm_perms <>", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsGreaterThan(String value) {
            addCriterion("sm_perms >", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsGreaterThanOrEqualTo(String value) {
            addCriterion("sm_perms >=", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsLessThan(String value) {
            addCriterion("sm_perms <", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsLessThanOrEqualTo(String value) {
            addCriterion("sm_perms <=", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsLike(String value) {
            addCriterion("sm_perms like", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsNotLike(String value) {
            addCriterion("sm_perms not like", value, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsIn(List<String> values) {
            addCriterion("sm_perms in", values, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsNotIn(List<String> values) {
            addCriterion("sm_perms not in", values, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsBetween(String value1, String value2) {
            addCriterion("sm_perms between", value1, value2, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmPermsNotBetween(String value1, String value2) {
            addCriterion("sm_perms not between", value1, value2, "smPerms");
            return (Criteria) this;
        }

        public Criteria andSmTypeIsNull() {
            addCriterion("sm_type is null");
            return (Criteria) this;
        }

        public Criteria andSmTypeIsNotNull() {
            addCriterion("sm_type is not null");
            return (Criteria) this;
        }

        public Criteria andSmTypeEqualTo(Integer value) {
            addCriterion("sm_type =", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotEqualTo(Integer value) {
            addCriterion("sm_type <>", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeGreaterThan(Integer value) {
            addCriterion("sm_type >", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_type >=", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLessThan(Integer value) {
            addCriterion("sm_type <", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sm_type <=", value, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeIn(List<Integer> values) {
            addCriterion("sm_type in", values, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotIn(List<Integer> values) {
            addCriterion("sm_type not in", values, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeBetween(Integer value1, Integer value2) {
            addCriterion("sm_type between", value1, value2, "smType");
            return (Criteria) this;
        }

        public Criteria andSmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_type not between", value1, value2, "smType");
            return (Criteria) this;
        }

        public Criteria andSmIconIsNull() {
            addCriterion("sm_icon is null");
            return (Criteria) this;
        }

        public Criteria andSmIconIsNotNull() {
            addCriterion("sm_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSmIconEqualTo(String value) {
            addCriterion("sm_icon =", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconNotEqualTo(String value) {
            addCriterion("sm_icon <>", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconGreaterThan(String value) {
            addCriterion("sm_icon >", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconGreaterThanOrEqualTo(String value) {
            addCriterion("sm_icon >=", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconLessThan(String value) {
            addCriterion("sm_icon <", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconLessThanOrEqualTo(String value) {
            addCriterion("sm_icon <=", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconLike(String value) {
            addCriterion("sm_icon like", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconNotLike(String value) {
            addCriterion("sm_icon not like", value, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconIn(List<String> values) {
            addCriterion("sm_icon in", values, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconNotIn(List<String> values) {
            addCriterion("sm_icon not in", values, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconBetween(String value1, String value2) {
            addCriterion("sm_icon between", value1, value2, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmIconNotBetween(String value1, String value2) {
            addCriterion("sm_icon not between", value1, value2, "smIcon");
            return (Criteria) this;
        }

        public Criteria andSmOrderIsNull() {
            addCriterion("sm_order is null");
            return (Criteria) this;
        }

        public Criteria andSmOrderIsNotNull() {
            addCriterion("sm_order is not null");
            return (Criteria) this;
        }

        public Criteria andSmOrderEqualTo(Integer value) {
            addCriterion("sm_order =", value, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderNotEqualTo(Integer value) {
            addCriterion("sm_order <>", value, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderGreaterThan(Integer value) {
            addCriterion("sm_order >", value, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sm_order >=", value, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderLessThan(Integer value) {
            addCriterion("sm_order <", value, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sm_order <=", value, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderIn(List<Integer> values) {
            addCriterion("sm_order in", values, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderNotIn(List<Integer> values) {
            addCriterion("sm_order not in", values, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderBetween(Integer value1, Integer value2) {
            addCriterion("sm_order between", value1, value2, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sm_order not between", value1, value2, "smOrder");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtIsNull() {
            addCriterion("sm_create_dt is null");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtIsNotNull() {
            addCriterion("sm_create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtEqualTo(Date value) {
            addCriterion("sm_create_dt =", value, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtNotEqualTo(Date value) {
            addCriterion("sm_create_dt <>", value, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtGreaterThan(Date value) {
            addCriterion("sm_create_dt >", value, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_create_dt >=", value, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtLessThan(Date value) {
            addCriterion("sm_create_dt <", value, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("sm_create_dt <=", value, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtIn(List<Date> values) {
            addCriterion("sm_create_dt in", values, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtNotIn(List<Date> values) {
            addCriterion("sm_create_dt not in", values, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtBetween(Date value1, Date value2) {
            addCriterion("sm_create_dt between", value1, value2, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("sm_create_dt not between", value1, value2, "smCreateDt");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidIsNull() {
            addCriterion("sm_create_uid is null");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidIsNotNull() {
            addCriterion("sm_create_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidEqualTo(Long value) {
            addCriterion("sm_create_uid =", value, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidNotEqualTo(Long value) {
            addCriterion("sm_create_uid <>", value, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidGreaterThan(Long value) {
            addCriterion("sm_create_uid >", value, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_create_uid >=", value, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidLessThan(Long value) {
            addCriterion("sm_create_uid <", value, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidLessThanOrEqualTo(Long value) {
            addCriterion("sm_create_uid <=", value, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidIn(List<Long> values) {
            addCriterion("sm_create_uid in", values, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidNotIn(List<Long> values) {
            addCriterion("sm_create_uid not in", values, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidBetween(Long value1, Long value2) {
            addCriterion("sm_create_uid between", value1, value2, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmCreateUidNotBetween(Long value1, Long value2) {
            addCriterion("sm_create_uid not between", value1, value2, "smCreateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtIsNull() {
            addCriterion("sm_update_dt is null");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtIsNotNull() {
            addCriterion("sm_update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtEqualTo(Date value) {
            addCriterion("sm_update_dt =", value, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtNotEqualTo(Date value) {
            addCriterion("sm_update_dt <>", value, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtGreaterThan(Date value) {
            addCriterion("sm_update_dt >", value, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sm_update_dt >=", value, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtLessThan(Date value) {
            addCriterion("sm_update_dt <", value, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtLessThanOrEqualTo(Date value) {
            addCriterion("sm_update_dt <=", value, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtIn(List<Date> values) {
            addCriterion("sm_update_dt in", values, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtNotIn(List<Date> values) {
            addCriterion("sm_update_dt not in", values, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtBetween(Date value1, Date value2) {
            addCriterion("sm_update_dt between", value1, value2, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateDtNotBetween(Date value1, Date value2) {
            addCriterion("sm_update_dt not between", value1, value2, "smUpdateDt");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidIsNull() {
            addCriterion("sm_update_uid is null");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidIsNotNull() {
            addCriterion("sm_update_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidEqualTo(Long value) {
            addCriterion("sm_update_uid =", value, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidNotEqualTo(Long value) {
            addCriterion("sm_update_uid <>", value, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidGreaterThan(Long value) {
            addCriterion("sm_update_uid >", value, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_update_uid >=", value, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidLessThan(Long value) {
            addCriterion("sm_update_uid <", value, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidLessThanOrEqualTo(Long value) {
            addCriterion("sm_update_uid <=", value, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidIn(List<Long> values) {
            addCriterion("sm_update_uid in", values, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidNotIn(List<Long> values) {
            addCriterion("sm_update_uid not in", values, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidBetween(Long value1, Long value2) {
            addCriterion("sm_update_uid between", value1, value2, "smUpdateUid");
            return (Criteria) this;
        }

        public Criteria andSmUpdateUidNotBetween(Long value1, Long value2) {
            addCriterion("sm_update_uid not between", value1, value2, "smUpdateUid");
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