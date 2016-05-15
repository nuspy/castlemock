<%@ include file="../../../../../includes.jspf"%>
<%--
  ~ Copyright 2016 Karl Dahlgren
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~   http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  --%>

<c:url var="update_websocket_stomp_application_url"  value="/web/wss/project/${webSocketStompProjectId}/application/${webSocketStompApplication.id}/update" />
<div class="content-top">
    <h1><spring:message code="websocket.stomp.updatewebsocketstompapplication.header.updateapplication" arguments="${webSocketStompApplication.name}"/></h1>
</div>
<form:form action="${update_websocket_stomp_application_url}" method="POST" commandName="webSocketStompApplication">
    <table class="formTable">
        <tr>
            <td class="column1"><label path="name"><spring:message code="websocket.stomp.updatewebsocketstompapplication.label.name"/></label></td>
            <td class="column2"><form:input path="name" id="webSocketStompApplicationNameInput" value="${webSocketStompApplication.name}"/></td>
        </tr>
    </table>
    
    <button class="button-success pure-button" type="submit" name="submit"><i class="fa fa-check-circle"></i><spring:message code="websocket.stomp.updatewebsocketstompapplication.button.updateapplication"/></button>
    <a href="<c:url value="/web/wss/project/${webSocketStompProjectId}/application/${webSocketStompApplication.id}"/>" class="button-error pure-button"><i class="fa fa-times"></i> <spring:message code="websocket.stomp.updatewebsocketstompapplication.button.cancel"/></a>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form:form>
<script>
    $("#webSocketStompApplicationNameInput").attr('required', '');
</script>
