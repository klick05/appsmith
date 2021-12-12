package com.appsmith.server.solutions;

import com.appsmith.server.services.AnalyticsService;
import com.appsmith.server.services.ApplicationPageService;
import com.appsmith.server.services.DatasourceService;
import com.appsmith.server.services.LayoutActionService;
import com.appsmith.server.services.NewPageService;
import com.appsmith.server.services.PluginService;
import com.appsmith.server.services.SessionUserService;
import com.appsmith.server.solutions.ce.CreateDBTablePageSolutionCEImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CreateDBTablePageSolutionImpl extends CreateDBTablePageSolutionCEImpl implements CreateDBTablePageSolution {

    public CreateDBTablePageSolutionImpl(DatasourceService datasourceService,
                                         NewPageService newPageService,
                                         LayoutActionService layoutActionService,
                                         ApplicationPageService applicationPageService,
                                         PluginService pluginService,
                                         AnalyticsService analyticsService,
                                         SessionUserService sessionUserService) {
        
        super(datasourceService, newPageService, layoutActionService, applicationPageService, pluginService, 
                analyticsService, sessionUserService);
    }
}