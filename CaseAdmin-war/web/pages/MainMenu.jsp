<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : MainMenu
    Created on : Sep 16, 2017, 12:14:13 AM
    Author     : Andrei
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <webuijsf:label id="label2" style="left: 72px; top: 48px; position: absolute" text="User"/>
                        <webuijsf:textField binding="#{pages$MainMenu.logged_user}" disabled="true" id="logged_user" style="position: absolute; left: 168px; top: 48px"/>
                        <webuijsf:table augmentTitle="false" binding="#{pages$MainMenu.table1}" id="table1" style="left: 72px; top: 96px; position: absolute"
                            title="User Permissions" width="216">
                            <webuijsf:tableRowGroup binding="#{pages$MainMenu.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{SessionBean1.assigned_permissions_array}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn1" sort="description">
                                    <webuijsf:hyperlink actionExpression="#{pages$MainMenu.hyperlink1_action}" id="hyperlink1" text="#{currentRow.value['description']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:table augmentTitle="false" binding="#{pages$MainMenu.table2}" id="table2"
                            style="left: 312px; top: 96px; position: absolute; width: 240px" title="List of Permissions" width="240">
                            <webuijsf:tableRowGroup binding="#{pages$MainMenu.tableRowGroup2}" id="tableRowGroup2" rows="10"
                                sourceData="#{SessionBean1.permissionarray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn2" sort="name">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['name']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:table augmentTitle="false" binding="#{pages$MainMenu.table3}" id="table3"
                            style="height: 101px; left: 72px; top: 288px; position: absolute; width: 216px" title="Assign Permissions" width="216">
                            <webuijsf:tableRowGroup binding="#{pages$MainMenu.tableRowGroup3}" id="tableRowGroup3" rows="10"
                                sourceData="#{SessionBean1.available_permission_array}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn3" sort="name">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['name']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn4">
                                    <webuijsf:button actionExpression="#{pages$MainMenu.btnAdd_action}" binding="#{pages$MainMenu.btnAdd}" id="btnAdd" text="Add"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:table augmentTitle="false" binding="#{pages$MainMenu.table4}" id="table4"
                            style="left: 312px; top: 288px; position: absolute; width: 240px" title="Remove Permissions" width="240">
                            <webuijsf:tableRowGroup binding="#{pages$MainMenu.tableRowGroup4}" id="tableRowGroup4" rows="10"
                                sourceData="#{SessionBean1.assigned_permissions_array}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Name" id="tableColumn5" sort="description">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['description']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn6">
                                    <webuijsf:button actionExpression="#{pages$MainMenu.btnRemove_action}" binding="#{pages$MainMenu.btnRemove}" id="btnRemove" text="Remove"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$MainMenu.bntLogout_action}" binding="#{pages$MainMenu.bntLogout}" id="bntLogout"
                            style="position: absolute; left: 360px; top: 48px" text="Log Out"/>
                        <webuijsf:table augmentTitle="false" binding="#{pages$MainMenu.table5}" id="table5"
                            style="left: 600px; top: 96px; position: absolute; width: 450px" title="List of Cases" visible="false" width="0">
                            <webuijsf:tableRowGroup binding="#{pages$MainMenu.tableRowGroup5}" id="tableRowGroup5" rows="10"
                                sourceData="#{SessionBean1.case_entry_view_raffle}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="No." id="tableColumn7" sort="caseNo">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['caseNo']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Title" id="tableColumn8" sort="caseTitle">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['caseTitle']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Nature Of Case" id="tableColumn9" sort="natureOfCase">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['natureOfCase']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Category" id="tableColumn10" sort="caseCategory">
                                    <webuijsf:staticText id="staticText7" text="#{currentRow.value['caseCategory']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Status" id="tableColumn11" sort="caseStatus">
                                    <webuijsf:staticText id="staticText8" text="#{currentRow.value['caseStatus']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn12">
                                    <webuijsf:button actionExpression="#{pages$MainMenu.btnUpdate_action}" binding="#{pages$MainMenu.btnUpdate}" id="btnUpdate" text="Update"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:table augmentTitle="false" binding="#{pages$MainMenu.table6}" id="table6" style="position: absolute; left: 600px; top: 288px"
                            title="List of Users" visible="false" width="0">
                            <webuijsf:tableRowGroup binding="#{pages$MainMenu.tableRowGroup6}" id="tableRowGroup6" rows="10"
                                sourceData="#{SessionBean1.userArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="id" id="tableColumn13" sort="id">
                                    <webuijsf:staticText id="staticText9" text="#{currentRow.value['id']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="username" id="tableColumn14" sort="username">
                                    <webuijsf:staticText id="staticText10" text="#{currentRow.value['username']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="firstName" id="tableColumn15" sort="firstName">
                                    <webuijsf:staticText id="staticText11" text="#{currentRow.value['firstName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="middleName" id="tableColumn16" sort="middleName">
                                    <webuijsf:staticText id="staticText12" text="#{currentRow.value['middleName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="lastName" id="tableColumn17" sort="lastName">
                                    <webuijsf:staticText id="staticText13" text="#{currentRow.value['lastName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Action" id="tableColumn18">
                                    <webuijsf:button actionExpression="#{pages$MainMenu.btnUpdate1_action}" binding="#{pages$MainMenu.btnUpdate1}"
                                        id="btnUpdate1" text="Update"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
