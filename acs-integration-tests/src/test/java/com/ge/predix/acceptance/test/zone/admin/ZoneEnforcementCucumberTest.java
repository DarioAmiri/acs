/*******************************************************************************
 * Copyright 2017 General Electric Company
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.ge.predix.acceptance.test.zone.admin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ge.predix.test.TestConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Test
@CucumberOptions(tags = "~@ignore")
public class ZoneEnforcementCucumberTest extends AbstractTestNGCucumberTests {
    // Used as the entry point for ZoneCreation StepsDefinitions

    @BeforeClass
    public void setup() {
        TestConfig.setupForEclipse(); // Starts ACS when running the test in eclipse.
    }
}
