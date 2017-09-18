<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : ViewCase
    Created on : Sep 16, 2017, 2:37:45 AM
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
                        <webuijsf:label id="label1" style="left: 96px; top: 48px; position: absolute" text="View Cases"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 96px; top: 96px; position: absolute; width: 0px" width="0">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{SessionBean1.case_entry_view_raffle}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="No." id="tableColumn1" sort="caseNo">
                                    <webuijsf:staticText id="staticText1" text="#{currentRow.value['caseNo']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Title" id="tableColumn2" sort="caseTitle">
                                    <webuijsf:staticText id="staticText2" text="#{currentRow.value['caseTitle']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Nature" id="tableColumn3" sort="natureOfCase">
                                    <webuijsf:staticText id="staticText3" text="#{currentRow.value['natureOfCase']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Category" id="tableColumn4" sort="caseCategory">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['caseCategory']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="Status" id="tableColumn5" sort="caseStatus">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['caseStatus']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{pages$ViewCase.btnBack_action}" binding="#{pages$ViewCase.btnBack}" id="btnBack"
                            style="left: 191px; top: 48px; position: absolute" text="Back"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
