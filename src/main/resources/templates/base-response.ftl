    "statusCode": "${status!}",
    <#if (statusDescription??) >
            "statusDescription": "${statusDescription!}",
    </#if>
    <#if (errorDescription??) >
    "errorDescription": "${errorDescription!}",
    </#if>
    <#if (requestUID??) >
    	"requestUID": "${requestUID}",
    </#if>


