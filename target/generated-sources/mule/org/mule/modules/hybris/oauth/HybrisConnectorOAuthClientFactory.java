
package org.mule.modules.hybris.oauth;

import java.io.Serializable;
import javax.annotation.Generated;
import org.mule.api.store.ObjectStore;
import org.mule.common.security.oauth.OAuthState;
import org.mule.modules.hybris.adapters.HybrisConnectorOAuth2Adapter;
import org.mule.modules.hybris.config.ConnectorConfig;
import org.mule.security.oauth.BaseOAuthClientFactory;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-07-31T02:51:08+10:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HybrisConnectorOAuthClientFactory
    extends BaseOAuthClientFactory
{

    private HybrisConnectorOAuthManager oauthManager;

    public HybrisConnectorOAuthClientFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        super(oauthManager, objectStore);
        this.oauthManager = (HybrisConnectorOAuthManager) oauthManager;
    }

    @Override
    protected Class<? extends OAuth2Adapter> getAdapterClass() {
        return (org.mule.modules.hybris.adapters.HybrisConnectorRestClientAdapter.class);
    }

    @Override
    protected void setCustomAdapterProperties(OAuth2Adapter adapter, OAuthState state) {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) adapter);
        ((ConnectorConfig) connector.getConfig()).setGreeting(oauthManager.getGreeting());
        ((ConnectorConfig) connector.getConfig()).setReply(oauthManager.getReply());
    }

    @Override
    protected void setCustomStateProperties(OAuth2Adapter adapter, OAuthState state) {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) adapter);
    }

}
