/*
 * Copyright 2022 Jeremy KUHN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.inverno.example.app_sql.domain;

/**
 * <p>
 * Represents a person.
 * </p>
 * 
 * @author <a href="mailto:jeremy.kuhn@inverno.io">Jeremy Kuhn</a>
 */
public class Person {
	
	private Long id;
	
	private final String firstname;
	private final String lastname;
	private final int age;

	public Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}

	public Person(long id, String firstname, String lastname, int age) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + '}';
	}
	
}
