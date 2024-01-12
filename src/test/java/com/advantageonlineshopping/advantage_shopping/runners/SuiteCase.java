package com.advantageonlineshopping.advantage_shopping.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ADVS_001_CreateNewAccount_Runner.class,
	           ADVS_002_Login_Runner.class,
	           ADVS_003_ComprarProduto_Runner.class,
	           ADVS_005_ContactUs_Runner.class
})
public class SuiteCase {

}
