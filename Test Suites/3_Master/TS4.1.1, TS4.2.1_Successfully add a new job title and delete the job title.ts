<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS4.1.1, TS4.2.1_Successfully add a new job title and delete the job title</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>a759ed37-f0d5-4e2b-abe7-ce93d8e472d4</testSuiteGuid>
   <testCaseLink>
      <guid>6955c7dd-00d2-476c-8a98-6f9fa5a6ed2f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC1_Login Scenarios/TC1.1_Successfully login to Orange HRM</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>2d90853c-c293-48c6-b8a0-49c0e5f03ad5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC4_Admin Job Scenarios/TC4.1_Add Job Titles Scenarios/TC4.1.1_Successfully add new job title</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>f1ac6cc0-3c2f-4ba3-bcc3-002d5e0202ba</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Add One Job Title</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>f1ac6cc0-3c2f-4ba3-bcc3-002d5e0202ba</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Title</value>
         <variableId>53dd5cb1-43b5-4aff-824c-a58e8690df3c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f1ac6cc0-3c2f-4ba3-bcc3-002d5e0202ba</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Description</value>
         <variableId>a45c007e-b238-48a4-8d7e-a14e9fb32fda</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f1ac6cc0-3c2f-4ba3-bcc3-002d5e0202ba</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Note</value>
         <variableId>49bf0347-0763-424f-8318-b7feda034f55</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>f1ac6cc0-3c2f-4ba3-bcc3-002d5e0202ba</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job File</value>
         <variableId>9ddd679c-1573-482f-8f2b-cfc9c48e37d5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>0171b915-2db4-4a0e-a321-7c5421e3b1e1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC4_Admin Job Scenarios/TC4.2_Delete Job Titles Scenarios/TC4.2.1_Successfully delete a job title</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1613ff7e-df71-4ce6-b456-75a3cec1055e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Delete One Job Title</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>1613ff7e-df71-4ce6-b456-75a3cec1055e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Job Title</value>
         <variableId>05da6f78-9ae6-41c5-953d-738e57d869ff</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
