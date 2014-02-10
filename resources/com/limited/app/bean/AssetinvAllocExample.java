package com.limited.app.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AssetinvAllocExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public AssetinvAllocExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdIsNull() {
            addCriterion("assetinv_id is null");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdIsNotNull() {
            addCriterion("assetinv_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdEqualTo(Integer value) {
            addCriterion("assetinv_id =", value, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdNotEqualTo(Integer value) {
            addCriterion("assetinv_id <>", value, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdGreaterThan(Integer value) {
            addCriterion("assetinv_id >", value, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assetinv_id >=", value, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdLessThan(Integer value) {
            addCriterion("assetinv_id <", value, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdLessThanOrEqualTo(Integer value) {
            addCriterion("assetinv_id <=", value, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdIn(List<Integer> values) {
            addCriterion("assetinv_id in", values, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdNotIn(List<Integer> values) {
            addCriterion("assetinv_id not in", values, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdBetween(Integer value1, Integer value2) {
            addCriterion("assetinv_id between", value1, value2, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAssetinvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assetinv_id not between", value1, value2, "assetinvId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdIsNull() {
            addCriterion("alloctype_id is null");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdIsNotNull() {
            addCriterion("alloctype_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdEqualTo(Integer value) {
            addCriterion("alloctype_id =", value, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdNotEqualTo(Integer value) {
            addCriterion("alloctype_id <>", value, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdGreaterThan(Integer value) {
            addCriterion("alloctype_id >", value, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alloctype_id >=", value, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdLessThan(Integer value) {
            addCriterion("alloctype_id <", value, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("alloctype_id <=", value, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdIn(List<Integer> values) {
            addCriterion("alloctype_id in", values, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdNotIn(List<Integer> values) {
            addCriterion("alloctype_id not in", values, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdBetween(Integer value1, Integer value2) {
            addCriterion("alloctype_id between", value1, value2, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAlloctypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alloctype_id not between", value1, value2, "alloctypeId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table assetinv_alloc
     *
     * @mbggenerated do_not_delete_during_merge Mon Feb 28 11:07:27 EST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table assetinv_alloc
     *
     * @mbggenerated Mon Feb 28 11:07:27 EST 2011
     */
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