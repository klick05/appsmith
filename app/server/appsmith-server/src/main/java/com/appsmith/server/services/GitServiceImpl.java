package com.appsmith.server.services;

import com.appsmith.external.git.GitExecutor;
import com.appsmith.git.service.GitExecutorImpl;
import com.appsmith.server.helpers.GitFileUtils;
import com.appsmith.server.services.ce.GitServiceCEImpl;
import com.appsmith.server.solutions.ImportExportApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Import({GitExecutorImpl.class})
public class GitServiceImpl extends GitServiceCEImpl implements GitService {

    public GitServiceImpl(UserService userService,
                          UserDataService userDataService,
                          SessionUserService sessionUserService,
                          ApplicationService applicationService,
                          ApplicationPageService applicationPageService,
                          GitFileUtils fileUtils,
                          ImportExportApplicationService importExportApplicationService,
                          GitExecutor gitExecutor) {

        super(userService, userDataService, sessionUserService, applicationService, applicationPageService, fileUtils,
                importExportApplicationService, gitExecutor);
    }
}
