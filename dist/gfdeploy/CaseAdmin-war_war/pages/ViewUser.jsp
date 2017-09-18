<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : ViewUser
    Created on : Sep 16, 2017, 2:47:40 AM
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
                        <webuijsf:label id="label1" style="left: 48px; top: 72px; position: absolute" text="View User"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 48px; top: 120px; position: absolute; width: 0px" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.userArray}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="ID" id="tableColumn1" sort="id">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['id']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Username" id="tableColumn2" sort="username">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['username']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="First Name" id="tableColumn3" sort="firstName">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['firstName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Middle Name" id="tableColumn4" sort="middleName">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['middleName']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Last Name" id="tableColumn5" sort="lastName">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['lastName']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$ViewUser.btnBack_action}" id="btnBack" style="left: 143px; top: 72px; position: absolute" text="Back"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
