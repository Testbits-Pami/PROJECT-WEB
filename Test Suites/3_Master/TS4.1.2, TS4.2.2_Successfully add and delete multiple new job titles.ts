<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS4.1.2, TS4.2.2_Successfully add and delete multiple new job titles</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>e2247054-c6ca-44d6-80c2-41dfec8c9915</testSuiteGuid>
   <testCaseLink>
      <guid>b1a1d974-eaa5-427f-b79a-161884558b33</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC1_Login Scenarios/TC1.1_Successfully login to Orange HRM</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>5366d40f-09b0-47b3-ab83-53b2bc687c58</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>7c95ba71-606b-421f-bf1d-815b27f9db2c</id>
         <masked>false</masked>
         <name>jobTitle</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/TC4_Admin Job Scenarios/TC4.1_Add Job Titles Scenarios/TC4.1.2_Successfully add multiple new job titles</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>471c8d7f-2348-48e2-bfe8-431a899cd604</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Add Multiple Job Titles</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>471c8d7f-2348-48e2-bfe8-431a899cd604</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Title</value>
         <variableId>7c95ba71-606b-421f-bf1d-815b27f9db2c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>471c8d7f-2348-48e2-bfe8-431a899cd604</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Description</value>
         <variableId>d96edf20-d7b0-485b-9bcc-4be71141d4a2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>471c8d7f-2348-48e2-bfe8-431a899cd604</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job File</value>
         <variableId>6df7ee35-a076-459b-bae5-c37f6eeadc3e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>471c8d7f-2348-48e2-bfe8-431a899cd604</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Note</value>
         <variableId>40b3b969-cab5-43f2-a653-da974567bc37</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>bb0d0861-92c1-44fe-a813-d78452186526</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC4_Admin Job Scenarios/TC4.2_Delete Job Titles Scenarios/TC4.2.2_Successfully delete multiple job titles</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
