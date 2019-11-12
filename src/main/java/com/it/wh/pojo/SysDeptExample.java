package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.List;

public class SysDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDeptExample() {
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

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Long value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Long value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Long value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Long value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Long> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Long> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Long value1, Long value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdIsNull() {
            addCriterion("dept_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdIsNotNull() {
            addCriterion("dept_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdEqualTo(Long value) {
            addCriterion("dept_parent_id =", value, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdNotEqualTo(Long value) {
            addCriterion("dept_parent_id <>", value, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdGreaterThan(Long value) {
            addCriterion("dept_parent_id >", value, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dept_parent_id >=", value, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdLessThan(Long value) {
            addCriterion("dept_parent_id <", value, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdLessThanOrEqualTo(Long value) {
            addCriterion("dept_parent_id <=", value, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdIn(List<Long> values) {
            addCriterion("dept_parent_id in", values, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdNotIn(List<Long> values) {
            addCriterion("dept_parent_id not in", values, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdBetween(Long value1, Long value2) {
            addCriterion("dept_parent_id between", value1, value2, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptParentIdNotBetween(Long value1, Long value2) {
            addCriterion("dept_parent_id not between", value1, value2, "deptParentId");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIsNull() {
            addCriterion("dept_order is null");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIsNotNull() {
            addCriterion("dept_order is not null");
            return (Criteria) this;
        }

        public Criteria andDeptOrderEqualTo(Integer value) {
            addCriterion("dept_order =", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotEqualTo(Integer value) {
            addCriterion("dept_order <>", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderGreaterThan(Integer value) {
            addCriterion("dept_order >", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_order >=", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderLessThan(Integer value) {
            addCriterion("dept_order <", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderLessThanOrEqualTo(Integer value) {
            addCriterion("dept_order <=", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIn(List<Integer> values) {
            addCriterion("dept_order in", values, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotIn(List<Integer> values) {
            addCriterion("dept_order not in", values, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderBetween(Integer value1, Integer value2) {
            addCriterion("dept_order between", value1, value2, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_order not between", value1, value2, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptFlagIsNull() {
            addCriterion("dept_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeptFlagIsNotNull() {
            addCriterion("dept_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeptFlagEqualTo(Byte value) {
            addCriterion("dept_flag =", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotEqualTo(Byte value) {
            addCriterion("dept_flag <>", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagGreaterThan(Byte value) {
            addCriterion("dept_flag >", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("dept_flag >=", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagLessThan(Byte value) {
            addCriterion("dept_flag <", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagLessThanOrEqualTo(Byte value) {
            addCriterion("dept_flag <=", value, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagIn(List<Byte> values) {
            addCriterion("dept_flag in", values, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotIn(List<Byte> values) {
            addCriterion("dept_flag not in", values, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagBetween(Byte value1, Byte value2) {
            addCriterion("dept_flag between", value1, value2, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("dept_flag not between", value1, value2, "deptFlag");
            return (Criteria) this;
        }

        public Criteria andDeptAddrIsNull() {
            addCriterion("dept_addr is null");
            return (Criteria) this;
        }

        public Criteria andDeptAddrIsNotNull() {
            addCriterion("dept_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAddrEqualTo(String value) {
            addCriterion("dept_addr =", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrNotEqualTo(String value) {
            addCriterion("dept_addr <>", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrGreaterThan(String value) {
            addCriterion("dept_addr >", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrGreaterThanOrEqualTo(String value) {
            addCriterion("dept_addr >=", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrLessThan(String value) {
            addCriterion("dept_addr <", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrLessThanOrEqualTo(String value) {
            addCriterion("dept_addr <=", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrLike(String value) {
            addCriterion("dept_addr like", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrNotLike(String value) {
            addCriterion("dept_addr not like", value, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrIn(List<String> values) {
            addCriterion("dept_addr in", values, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrNotIn(List<String> values) {
            addCriterion("dept_addr not in", values, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrBetween(String value1, String value2) {
            addCriterion("dept_addr between", value1, value2, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptAddrNotBetween(String value1, String value2) {
            addCriterion("dept_addr not between", value1, value2, "deptAddr");
            return (Criteria) this;
        }

        public Criteria andDeptContactIsNull() {
            addCriterion("dept_contact is null");
            return (Criteria) this;
        }

        public Criteria andDeptContactIsNotNull() {
            addCriterion("dept_contact is not null");
            return (Criteria) this;
        }

        public Criteria andDeptContactEqualTo(String value) {
            addCriterion("dept_contact =", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactNotEqualTo(String value) {
            addCriterion("dept_contact <>", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactGreaterThan(String value) {
            addCriterion("dept_contact >", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactGreaterThanOrEqualTo(String value) {
            addCriterion("dept_contact >=", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactLessThan(String value) {
            addCriterion("dept_contact <", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactLessThanOrEqualTo(String value) {
            addCriterion("dept_contact <=", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactLike(String value) {
            addCriterion("dept_contact like", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactNotLike(String value) {
            addCriterion("dept_contact not like", value, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactIn(List<String> values) {
            addCriterion("dept_contact in", values, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactNotIn(List<String> values) {
            addCriterion("dept_contact not in", values, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactBetween(String value1, String value2) {
            addCriterion("dept_contact between", value1, value2, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptContactNotBetween(String value1, String value2) {
            addCriterion("dept_contact not between", value1, value2, "deptContact");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNull() {
            addCriterion("dept_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNotNull() {
            addCriterion("dept_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneEqualTo(String value) {
            addCriterion("dept_phone =", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotEqualTo(String value) {
            addCriterion("dept_phone <>", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThan(String value) {
            addCriterion("dept_phone >", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dept_phone >=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThan(String value) {
            addCriterion("dept_phone <", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThanOrEqualTo(String value) {
            addCriterion("dept_phone <=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLike(String value) {
            addCriterion("dept_phone like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotLike(String value) {
            addCriterion("dept_phone not like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIn(List<String> values) {
            addCriterion("dept_phone in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotIn(List<String> values) {
            addCriterion("dept_phone not in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneBetween(String value1, String value2) {
            addCriterion("dept_phone between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotBetween(String value1, String value2) {
            addCriterion("dept_phone not between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptDescIsNull() {
            addCriterion("dept_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeptDescIsNotNull() {
            addCriterion("dept_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDescEqualTo(String value) {
            addCriterion("dept_desc =", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotEqualTo(String value) {
            addCriterion("dept_desc <>", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescGreaterThan(String value) {
            addCriterion("dept_desc >", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescGreaterThanOrEqualTo(String value) {
            addCriterion("dept_desc >=", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLessThan(String value) {
            addCriterion("dept_desc <", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLessThanOrEqualTo(String value) {
            addCriterion("dept_desc <=", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescLike(String value) {
            addCriterion("dept_desc like", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotLike(String value) {
            addCriterion("dept_desc not like", value, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescIn(List<String> values) {
            addCriterion("dept_desc in", values, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotIn(List<String> values) {
            addCriterion("dept_desc not in", values, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescBetween(String value1, String value2) {
            addCriterion("dept_desc between", value1, value2, "deptDesc");
            return (Criteria) this;
        }

        public Criteria andDeptDescNotBetween(String value1, String value2) {
            addCriterion("dept_desc not between", value1, value2, "deptDesc");
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