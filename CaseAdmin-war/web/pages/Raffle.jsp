<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Raffle
    Created on : Sep 16, 2017, 10:45:02 AM
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
                        <webuijsf:label id="label1" style="left: 312px; top: 24px; position: absolute" text="Raffle"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 216px; top: 96px; position: absolute; width: 0px" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.assigned_case_array}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="Case No" id="tableColumn1" sort="caseNo">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['caseNo']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Justice" id="tableColumn2" sort="justiceName">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['justiceName']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$Raffle.btnGenerate_action}" binding="#{pages$Raffle.btnGenerate}" id="btnGenerate"
                            style="left: 311px; top: 240px; position: absolute" text="Generate"/>
                        <webuijsf:button actionExpression="#{pages$Raffle.btnBack_action}" binding="#{pages$Raffle.btnBack}" id="btnBack"
                            style="left: 311px; top: 48px; position: absolute" text="Back"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
