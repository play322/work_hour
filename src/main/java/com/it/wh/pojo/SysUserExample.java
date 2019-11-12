package com.it.wh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSuNameIsNull() {
            addCriterion("su_name is null");
            return (Criteria) this;
        }

        public Criteria andSuNameIsNotNull() {
            addCriterion("su_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuNameEqualTo(String value) {
            addCriterion("su_name =", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotEqualTo(String value) {
            addCriterion("su_name <>", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameGreaterThan(String value) {
            addCriterion("su_name >", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameGreaterThanOrEqualTo(String value) {
            addCriterion("su_name >=", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLessThan(String value) {
            addCriterion("su_name <", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLessThanOrEqualTo(String value) {
            addCriterion("su_name <=", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameLike(String value) {
            addCriterion("su_name like", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotLike(String value) {
            addCriterion("su_name not like", value, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameIn(List<String> values) {
            addCriterion("su_name in", values, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotIn(List<String> values) {
            addCriterion("su_name not in", values, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameBetween(String value1, String value2) {
            addCriterion("su_name between", value1, value2, "suName");
            return (Criteria) this;
        }

        public Criteria andSuNameNotBetween(String value1, String value2) {
            addCriterion("su_name not between", value1, value2, "suName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameIsNull() {
            addCriterion("su_login_name is null");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameIsNotNull() {
            addCriterion("su_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameEqualTo(String value) {
            addCriterion("su_login_name =", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameNotEqualTo(String value) {
            addCriterion("su_login_name <>", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameGreaterThan(String value) {
            addCriterion("su_login_name >", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("su_login_name >=", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameLessThan(String value) {
            addCriterion("su_login_name <", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameLessThanOrEqualTo(String value) {
            addCriterion("su_login_name <=", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameLike(String value) {
            addCriterion("su_login_name like", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameNotLike(String value) {
            addCriterion("su_login_name not like", value, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameIn(List<String> values) {
            addCriterion("su_login_name in", values, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameNotIn(List<String> values) {
            addCriterion("su_login_name not in", values, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameBetween(String value1, String value2) {
            addCriterion("su_login_name between", value1, value2, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginNameNotBetween(String value1, String value2) {
            addCriterion("su_login_name not between", value1, value2, "suLoginName");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdIsNull() {
            addCriterion("su_login_passwd is null");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdIsNotNull() {
            addCriterion("su_login_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdEqualTo(String value) {
            addCriterion("su_login_passwd =", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdNotEqualTo(String value) {
            addCriterion("su_login_passwd <>", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdGreaterThan(String value) {
            addCriterion("su_login_passwd >", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("su_login_passwd >=", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdLessThan(String value) {
            addCriterion("su_login_passwd <", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdLessThanOrEqualTo(String value) {
            addCriterion("su_login_passwd <=", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdLike(String value) {
            addCriterion("su_login_passwd like", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdNotLike(String value) {
            addCriterion("su_login_passwd not like", value, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdIn(List<String> values) {
            addCriterion("su_login_passwd in", values, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdNotIn(List<String> values) {
            addCriterion("su_login_passwd not in", values, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdBetween(String value1, String value2) {
            addCriterion("su_login_passwd between", value1, value2, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuLoginPasswdNotBetween(String value1, String value2) {
            addCriterion("su_login_passwd not between", value1, value2, "suLoginPasswd");
            return (Criteria) this;
        }

        public Criteria andSuSexIsNull() {
            addCriterion("su_sex is null");
            return (Criteria) this;
        }

        public Criteria andSuSexIsNotNull() {
            addCriterion("su_sex is not null");
            return (Criteria) this;
        }

        public Criteria andSuSexEqualTo(Byte value) {
            addCriterion("su_sex =", value, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexNotEqualTo(Byte value) {
            addCriterion("su_sex <>", value, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexGreaterThan(Byte value) {
            addCriterion("su_sex >", value, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("su_sex >=", value, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexLessThan(Byte value) {
            addCriterion("su_sex <", value, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexLessThanOrEqualTo(Byte value) {
            addCriterion("su_sex <=", value, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexIn(List<Byte> values) {
            addCriterion("su_sex in", values, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexNotIn(List<Byte> values) {
            addCriterion("su_sex not in", values, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexBetween(Byte value1, Byte value2) {
            addCriterion("su_sex between", value1, value2, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuSexNotBetween(Byte value1, Byte value2) {
            addCriterion("su_sex not between", value1, value2, "suSex");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtIsNull() {
            addCriterion("su_birth_dt is null");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtIsNotNull() {
            addCriterion("su_birth_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtEqualTo(Date value) {
            addCriterionForJDBCDate("su_birth_dt =", value, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtNotEqualTo(Date value) {
            addCriterionForJDBCDate("su_birth_dt <>", value, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtGreaterThan(Date value) {
            addCriterionForJDBCDate("su_birth_dt >", value, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("su_birth_dt >=", value, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtLessThan(Date value) {
            addCriterionForJDBCDate("su_birth_dt <", value, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("su_birth_dt <=", value, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtIn(List<Date> values) {
            addCriterionForJDBCDate("su_birth_dt in", values, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtNotIn(List<Date> values) {
            addCriterionForJDBCDate("su_birth_dt not in", values, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("su_birth_dt between", value1, value2, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuBirthDtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("su_birth_dt not between", value1, value2, "suBirthDt");
            return (Criteria) this;
        }

        public Criteria andSuIconIsNull() {
            addCriterion("su_icon is null");
            return (Criteria) this;
        }

        public Criteria andSuIconIsNotNull() {
            addCriterion("su_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSuIconEqualTo(String value) {
            addCriterion("su_icon =", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconNotEqualTo(String value) {
            addCriterion("su_icon <>", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconGreaterThan(String value) {
            addCriterion("su_icon >", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconGreaterThanOrEqualTo(String value) {
            addCriterion("su_icon >=", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconLessThan(String value) {
            addCriterion("su_icon <", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconLessThanOrEqualTo(String value) {
            addCriterion("su_icon <=", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconLike(String value) {
            addCriterion("su_icon like", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconNotLike(String value) {
            addCriterion("su_icon not like", value, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconIn(List<String> values) {
            addCriterion("su_icon in", values, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconNotIn(List<String> values) {
            addCriterion("su_icon not in", values, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconBetween(String value1, String value2) {
            addCriterion("su_icon between", value1, value2, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuIconNotBetween(String value1, String value2) {
            addCriterion("su_icon not between", value1, value2, "suIcon");
            return (Criteria) this;
        }

        public Criteria andSuAddressIsNull() {
            addCriterion("su_address is null");
            return (Criteria) this;
        }

        public Criteria andSuAddressIsNotNull() {
            addCriterion("su_address is not null");
            return (Criteria) this;
        }

        public Criteria andSuAddressEqualTo(String value) {
            addCriterion("su_address =", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotEqualTo(String value) {
            addCriterion("su_address <>", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressGreaterThan(String value) {
            addCriterion("su_address >", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("su_address >=", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressLessThan(String value) {
            addCriterion("su_address <", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressLessThanOrEqualTo(String value) {
            addCriterion("su_address <=", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressLike(String value) {
            addCriterion("su_address like", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotLike(String value) {
            addCriterion("su_address not like", value, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressIn(List<String> values) {
            addCriterion("su_address in", values, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotIn(List<String> values) {
            addCriterion("su_address not in", values, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressBetween(String value1, String value2) {
            addCriterion("su_address between", value1, value2, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuAddressNotBetween(String value1, String value2) {
            addCriterion("su_address not between", value1, value2, "suAddress");
            return (Criteria) this;
        }

        public Criteria andSuProvinceIsNull() {
            addCriterion("su_province is null");
            return (Criteria) this;
        }

        public Criteria andSuProvinceIsNotNull() {
            addCriterion("su_province is not null");
            return (Criteria) this;
        }

        public Criteria andSuProvinceEqualTo(String value) {
            addCriterion("su_province =", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceNotEqualTo(String value) {
            addCriterion("su_province <>", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceGreaterThan(String value) {
            addCriterion("su_province >", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("su_province >=", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceLessThan(String value) {
            addCriterion("su_province <", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceLessThanOrEqualTo(String value) {
            addCriterion("su_province <=", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceLike(String value) {
            addCriterion("su_province like", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceNotLike(String value) {
            addCriterion("su_province not like", value, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceIn(List<String> values) {
            addCriterion("su_province in", values, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceNotIn(List<String> values) {
            addCriterion("su_province not in", values, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceBetween(String value1, String value2) {
            addCriterion("su_province between", value1, value2, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuProvinceNotBetween(String value1, String value2) {
            addCriterion("su_province not between", value1, value2, "suProvince");
            return (Criteria) this;
        }

        public Criteria andSuCityIsNull() {
            addCriterion("su_city is null");
            return (Criteria) this;
        }

        public Criteria andSuCityIsNotNull() {
            addCriterion("su_city is not null");
            return (Criteria) this;
        }

        public Criteria andSuCityEqualTo(String value) {
            addCriterion("su_city =", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityNotEqualTo(String value) {
            addCriterion("su_city <>", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityGreaterThan(String value) {
            addCriterion("su_city >", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityGreaterThanOrEqualTo(String value) {
            addCriterion("su_city >=", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityLessThan(String value) {
            addCriterion("su_city <", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityLessThanOrEqualTo(String value) {
            addCriterion("su_city <=", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityLike(String value) {
            addCriterion("su_city like", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityNotLike(String value) {
            addCriterion("su_city not like", value, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityIn(List<String> values) {
            addCriterion("su_city in", values, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityNotIn(List<String> values) {
            addCriterion("su_city not in", values, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityBetween(String value1, String value2) {
            addCriterion("su_city between", value1, value2, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuCityNotBetween(String value1, String value2) {
            addCriterion("su_city not between", value1, value2, "suCity");
            return (Criteria) this;
        }

        public Criteria andSuDistrictIsNull() {
            addCriterion("su_district is null");
            return (Criteria) this;
        }

        public Criteria andSuDistrictIsNotNull() {
            addCriterion("su_district is not null");
            return (Criteria) this;
        }

        public Criteria andSuDistrictEqualTo(String value) {
            addCriterion("su_district =", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictNotEqualTo(String value) {
            addCriterion("su_district <>", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictGreaterThan(String value) {
            addCriterion("su_district >", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("su_district >=", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictLessThan(String value) {
            addCriterion("su_district <", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictLessThanOrEqualTo(String value) {
            addCriterion("su_district <=", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictLike(String value) {
            addCriterion("su_district like", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictNotLike(String value) {
            addCriterion("su_district not like", value, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictIn(List<String> values) {
            addCriterion("su_district in", values, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictNotIn(List<String> values) {
            addCriterion("su_district not in", values, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictBetween(String value1, String value2) {
            addCriterion("su_district between", value1, value2, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDistrictNotBetween(String value1, String value2) {
            addCriterion("su_district not between", value1, value2, "suDistrict");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdIsNull() {
            addCriterion("su_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdIsNotNull() {
            addCriterion("su_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdEqualTo(Long value) {
            addCriterion("su_dept_id =", value, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdNotEqualTo(Long value) {
            addCriterion("su_dept_id <>", value, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdGreaterThan(Long value) {
            addCriterion("su_dept_id >", value, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("su_dept_id >=", value, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdLessThan(Long value) {
            addCriterion("su_dept_id <", value, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("su_dept_id <=", value, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdIn(List<Long> values) {
            addCriterion("su_dept_id in", values, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdNotIn(List<Long> values) {
            addCriterion("su_dept_id not in", values, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdBetween(Long value1, Long value2) {
            addCriterion("su_dept_id between", value1, value2, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("su_dept_id not between", value1, value2, "suDeptId");
            return (Criteria) this;
        }

        public Criteria andSuEmailIsNull() {
            addCriterion("su_email is null");
            return (Criteria) this;
        }

        public Criteria andSuEmailIsNotNull() {
            addCriterion("su_email is not null");
            return (Criteria) this;
        }

        public Criteria andSuEmailEqualTo(String value) {
            addCriterion("su_email =", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotEqualTo(String value) {
            addCriterion("su_email <>", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailGreaterThan(String value) {
            addCriterion("su_email >", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("su_email >=", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailLessThan(String value) {
            addCriterion("su_email <", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailLessThanOrEqualTo(String value) {
            addCriterion("su_email <=", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailLike(String value) {
            addCriterion("su_email like", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotLike(String value) {
            addCriterion("su_email not like", value, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailIn(List<String> values) {
            addCriterion("su_email in", values, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotIn(List<String> values) {
            addCriterion("su_email not in", values, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailBetween(String value1, String value2) {
            addCriterion("su_email between", value1, value2, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuEmailNotBetween(String value1, String value2) {
            addCriterion("su_email not between", value1, value2, "suEmail");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNull() {
            addCriterion("su_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNotNull() {
            addCriterion("su_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSuMobileEqualTo(String value) {
            addCriterion("su_mobile =", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotEqualTo(String value) {
            addCriterion("su_mobile <>", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThan(String value) {
            addCriterion("su_mobile >", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("su_mobile >=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThan(String value) {
            addCriterion("su_mobile <", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThanOrEqualTo(String value) {
            addCriterion("su_mobile <=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLike(String value) {
            addCriterion("su_mobile like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotLike(String value) {
            addCriterion("su_mobile not like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileIn(List<String> values) {
            addCriterion("su_mobile in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotIn(List<String> values) {
            addCriterion("su_mobile not in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileBetween(String value1, String value2) {
            addCriterion("su_mobile between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotBetween(String value1, String value2) {
            addCriterion("su_mobile not between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNull() {
            addCriterion("su_status is null");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNotNull() {
            addCriterion("su_status is not null");
            return (Criteria) this;
        }

        public Criteria andSuStatusEqualTo(Byte value) {
            addCriterion("su_status =", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotEqualTo(Byte value) {
            addCriterion("su_status <>", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThan(Byte value) {
            addCriterion("su_status >", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("su_status >=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThan(Byte value) {
            addCriterion("su_status <", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThanOrEqualTo(Byte value) {
            addCriterion("su_status <=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusIn(List<Byte> values) {
            addCriterion("su_status in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotIn(List<Byte> values) {
            addCriterion("su_status not in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusBetween(Byte value1, Byte value2) {
            addCriterion("su_status between", value1, value2, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("su_status not between", value1, value2, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidIsNull() {
            addCriterion("su_create_uid is null");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidIsNotNull() {
            addCriterion("su_create_uid is not null");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidEqualTo(Byte value) {
            addCriterion("su_create_uid =", value, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidNotEqualTo(Byte value) {
            addCriterion("su_create_uid <>", value, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidGreaterThan(Byte value) {
            addCriterion("su_create_uid >", value, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidGreaterThanOrEqualTo(Byte value) {
            addCriterion("su_create_uid >=", value, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidLessThan(Byte value) {
            addCriterion("su_create_uid <", value, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidLessThanOrEqualTo(Byte value) {
            addCriterion("su_create_uid <=", value, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidIn(List<Byte> values) {
            addCriterion("su_create_uid in", values, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidNotIn(List<Byte> values) {
            addCriterion("su_create_uid not in", values, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidBetween(Byte value1, Byte value2) {
            addCriterion("su_create_uid between", value1, value2, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateUidNotBetween(Byte value1, Byte value2) {
            addCriterion("su_create_uid not between", value1, value2, "suCreateUid");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtIsNull() {
            addCriterion("su_create_dt is null");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtIsNotNull() {
            addCriterion("su_create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtEqualTo(Date value) {
            addCriterion("su_create_dt =", value, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtNotEqualTo(Date value) {
            addCriterion("su_create_dt <>", value, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtGreaterThan(Date value) {
            addCriterion("su_create_dt >", value, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("su_create_dt >=", value, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtLessThan(Date value) {
            addCriterion("su_create_dt <", value, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("su_create_dt <=", value, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtIn(List<Date> values) {
            addCriterion("su_create_dt in", values, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtNotIn(List<Date> values) {
            addCriterion("su_create_dt not in", values, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtBetween(Date value1, Date value2) {
            addCriterion("su_create_dt between", value1, value2, "suCreateDt");
            return (Criteria) this;
        }

        public Criteria andSuCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("su_create_dt not between", value1, value2, "suCreateDt");
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