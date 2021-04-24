package com.wlkq.pe.bean;

import java.util.ArrayList;
import java.util.List;

public class PecUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PecUserExample() {
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

        public Criteria andLoginacctIsNull() {
            addCriterion("loginacct is null");
            return (Criteria) this;
        }

        public Criteria andLoginacctIsNotNull() {
            addCriterion("loginacct is not null");
            return (Criteria) this;
        }

        public Criteria andLoginacctEqualTo(String value) {
            addCriterion("loginacct =", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctNotEqualTo(String value) {
            addCriterion("loginacct <>", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctGreaterThan(String value) {
            addCriterion("loginacct >", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctGreaterThanOrEqualTo(String value) {
            addCriterion("loginacct >=", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctLessThan(String value) {
            addCriterion("loginacct <", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctLessThanOrEqualTo(String value) {
            addCriterion("loginacct <=", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctLike(String value) {
            addCriterion("loginacct like", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctNotLike(String value) {
            addCriterion("loginacct not like", value, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctIn(List<String> values) {
            addCriterion("loginacct in", values, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctNotIn(List<String> values) {
            addCriterion("loginacct not in", values, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctBetween(String value1, String value2) {
            addCriterion("loginacct between", value1, value2, "loginacct");
            return (Criteria) this;
        }

        public Criteria andLoginacctNotBetween(String value1, String value2) {
            addCriterion("loginacct not between", value1, value2, "loginacct");
            return (Criteria) this;
        }

        public Criteria andUserpswdIsNull() {
            addCriterion("userpswd is null");
            return (Criteria) this;
        }

        public Criteria andUserpswdIsNotNull() {
            addCriterion("userpswd is not null");
            return (Criteria) this;
        }

        public Criteria andUserpswdEqualTo(String value) {
            addCriterion("userpswd =", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdNotEqualTo(String value) {
            addCriterion("userpswd <>", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdGreaterThan(String value) {
            addCriterion("userpswd >", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdGreaterThanOrEqualTo(String value) {
            addCriterion("userpswd >=", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdLessThan(String value) {
            addCriterion("userpswd <", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdLessThanOrEqualTo(String value) {
            addCriterion("userpswd <=", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdLike(String value) {
            addCriterion("userpswd like", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdNotLike(String value) {
            addCriterion("userpswd not like", value, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdIn(List<String> values) {
            addCriterion("userpswd in", values, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdNotIn(List<String> values) {
            addCriterion("userpswd not in", values, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdBetween(String value1, String value2) {
            addCriterion("userpswd between", value1, value2, "userpswd");
            return (Criteria) this;
        }

        public Criteria andUserpswdNotBetween(String value1, String value2) {
            addCriterion("userpswd not between", value1, value2, "userpswd");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
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