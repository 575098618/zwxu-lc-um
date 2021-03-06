package com.zwxu.lc.um.model;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public MenuExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
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

		public Criteria andMenuNameIsNull() {
			addCriterion("menu_name is null");
			return (Criteria) this;
		}

		public Criteria andMenuNameIsNotNull() {
			addCriterion("menu_name is not null");
			return (Criteria) this;
		}

		public Criteria andMenuNameEqualTo(String value) {
			addCriterion("menu_name =", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotEqualTo(String value) {
			addCriterion("menu_name <>", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameGreaterThan(String value) {
			addCriterion("menu_name >", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
			addCriterion("menu_name >=", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameLessThan(String value) {
			addCriterion("menu_name <", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameLessThanOrEqualTo(String value) {
			addCriterion("menu_name <=", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameLike(String value) {
			addCriterion("menu_name like", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotLike(String value) {
			addCriterion("menu_name not like", value, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameIn(List<String> values) {
			addCriterion("menu_name in", values, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotIn(List<String> values) {
			addCriterion("menu_name not in", values, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameBetween(String value1, String value2) {
			addCriterion("menu_name between", value1, value2, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuNameNotBetween(String value1, String value2) {
			addCriterion("menu_name not between", value1, value2, "menuName");
			return (Criteria) this;
		}

		public Criteria andMenuUrlIsNull() {
			addCriterion("menu_url is null");
			return (Criteria) this;
		}

		public Criteria andMenuUrlIsNotNull() {
			addCriterion("menu_url is not null");
			return (Criteria) this;
		}

		public Criteria andMenuUrlEqualTo(String value) {
			addCriterion("menu_url =", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotEqualTo(String value) {
			addCriterion("menu_url <>", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlGreaterThan(String value) {
			addCriterion("menu_url >", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
			addCriterion("menu_url >=", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlLessThan(String value) {
			addCriterion("menu_url <", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlLessThanOrEqualTo(String value) {
			addCriterion("menu_url <=", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlLike(String value) {
			addCriterion("menu_url like", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotLike(String value) {
			addCriterion("menu_url not like", value, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlIn(List<String> values) {
			addCriterion("menu_url in", values, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotIn(List<String> values) {
			addCriterion("menu_url not in", values, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlBetween(String value1, String value2) {
			addCriterion("menu_url between", value1, value2, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andMenuUrlNotBetween(String value1, String value2) {
			addCriterion("menu_url not between", value1, value2, "menuUrl");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(Integer value) {
			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(Integer value) {
			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(Integer value) {
			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(Integer value) {
			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<Integer> values) {
			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<Integer> values) {
			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(Integer value1, Integer value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Integer value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Integer value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Integer value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Integer value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Integer> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Integer> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table t_menu
	 * @mbggenerated  Mon Nov 28 13:57:39 CST 2016
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_menu
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 28 10:44:08 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}