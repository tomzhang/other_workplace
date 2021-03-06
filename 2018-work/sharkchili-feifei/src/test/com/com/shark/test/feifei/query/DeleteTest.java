package com.com.shark.test.feifei.query;

import com.com.shark.test.feifei.base.BaseQueryTest;
import com.shark.feifei.query.condition.EntityCondition;
import com.shark.feifei.query.query.EntityQuery;
import com.shark.test.feifei.entity.Student;
import org.testng.annotations.Test;

/**
 * @Author: Shark Chili
 * @Email: sharkchili.su@gmail.com
 * @Date: 2018/10/25 0025
 */
public class DeleteTest extends BaseQueryTest {

	@Test
	public void testDelete() {
		query= EntityQuery.create().delete(Student.create().setName("Rose"));
		query.query();
	}

	@Test
	public void testDeleteWhere(){
		query= EntityQuery.create().delete(Student.create()).where(EntityCondition.create(Student.create().setName("Mark")));
		query.query();
	}
}
