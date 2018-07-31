
package org.mule.modules.hybris.processors;

import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.modules.hybris.oauth.HybrisConnectorOAuthManager;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-07-31T02:51:08+10:00", comments = "Build UNNAMED.2793.f49b6c7")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<HybrisConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<HybrisConnectorOAuthManager> getOAuthManagerClass() {
        return HybrisConnectorOAuthManager.class;
    }

}
