package cn.et.food.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import cn.et.food.entity.Emp;
import cn.et.food.entity.EmpExample;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @SelectProvider(type=EmpSqlProvider.class, method="countByExample")
    long countByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @DeleteProvider(type=EmpSqlProvider.class, method="deleteByExample")
    int deleteByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @Delete({
        "delete from emp",
        "where empno = #{empno,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @Insert({
        "insert into emp (empno, ename, ",
        "job, sal, deptno, ",
        "sex)",
        "values (#{empno,jdbcType=INTEGER}, #{ename,jdbcType=VARCHAR}, ",
        "#{job,jdbcType=VARCHAR}, #{sal,jdbcType=INTEGER}, #{deptno,jdbcType=INTEGER}, ",
        "#{sex,jdbcType=INTEGER})"
    })
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @InsertProvider(type=EmpSqlProvider.class, method="insertSelective")
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @SelectProvider(type=EmpSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="empno", property="empno", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ename", property="ename", jdbcType=JdbcType.VARCHAR),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="sal", property="sal", jdbcType=JdbcType.INTEGER),
        @Result(column="deptno", property="deptno", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER)
    })
    List<Emp> selectByExampleWithRowbounds(EmpExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @SelectProvider(type=EmpSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="empno", property="empno", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ename", property="ename", jdbcType=JdbcType.VARCHAR),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="sal", property="sal", jdbcType=JdbcType.INTEGER),
        @Result(column="deptno", property="deptno", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER)
    })
    List<Emp> selectByExample(EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @Select({
        "select",
        "empno, ename, job, sal, deptno, sex",
        "from emp",
        "where empno = #{empno,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="empno", property="empno", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ename", property="ename", jdbcType=JdbcType.VARCHAR),
        @Result(column="job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="sal", property="sal", jdbcType=JdbcType.INTEGER),
        @Result(column="deptno", property="deptno", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER)
    })
    Emp selectByPrimaryKey(Integer empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @UpdateProvider(type=EmpSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @UpdateProvider(type=EmpSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @UpdateProvider(type=EmpSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbg.generated Wed Dec 13 16:26:37 CST 2017
     */
    @Update({
        "update emp",
        "set ename = #{ename,jdbcType=VARCHAR},",
          "job = #{job,jdbcType=VARCHAR},",
          "sal = #{sal,jdbcType=INTEGER},",
          "deptno = #{deptno,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=INTEGER}",
        "where empno = #{empno,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Emp record);
}