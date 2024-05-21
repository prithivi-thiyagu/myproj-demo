package com.star.ig.api.gateway;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.star.ig.api.digilock.sys.gateway.DigiLockGatewayImpl;
import com.star.ig.base.core.audit.service.APIAuditLogService;
import com.star.ig.base.core.gateway.CSLRetryGateway;
import com.star.ig.base.core.util.FreeMarkerConvertor;
import com.star.ig.base.core.web.CSLRequestContext;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GatewayTestClass.class)
class GatewayTestClass {
	
	@InjectMocks
    DigiLockGatewayImpl gateway;

	
        private CSLRequestContext cslRequestContext;
	
	    @Mock
	    private CSLRetryGateway cslRetryGateway;

	    @Mock
	    private APIAuditLogService apiAuditLogService;

	    @Mock
	    private ObjectMapper objectMapper;

	    @Mock
	    private FreeMarkerConvertor freeMarkerConvertor;
	    

	
}
