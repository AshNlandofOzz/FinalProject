package com.skilldistillery.childcare.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NapTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Nap nap;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAChildcare");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		nap = em.find(Nap.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		nap = null;
	}
	@Test
	void test() {
		assertNotNull(nap);
<<<<<<< HEAD
		assertEquals("2022-11-20T14:51:32", nap.getTimeFinish().toString());
=======
		assertEquals(1, nap.getId());
>>>>>>> d77bb906548dd8d79e0dbd547bbfb58bf7120cf2
	}

}
