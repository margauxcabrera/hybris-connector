
package org.mule.modules.hybris.oauth;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleMessage;
import org.mule.api.expression.ExpressionManager;
import org.mule.api.store.ObjectStore;
import org.mule.modules.hybris.HybrisConnector;
import org.mule.modules.hybris.adapters.HybrisConnectorOAuth2Adapter;
import org.mule.modules.hybris.config.ConnectorConfig;
import org.mule.security.oauth.BaseOAuth2Manager;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;
import org.mule.security.oauth.OnNoTokenPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * A {@code HybrisConnectorOAuthManager} is a wrapper around {@link HybrisConnector } that adds access token management capabilities to the pojo.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-07-31T02:51:08+10:00", comments = "Build UNNAMED.2793.f49b6c7")
public class HybrisConnectorOAuthManager
    extends BaseOAuth2Manager<OAuth2Adapter>
{

    private static Logger logger = LoggerFactory.getLogger(HybrisConnectorOAuthManager.class);

    @Override
    protected Logger getLogger() {
        return logger;
    }

    /**
     * Sets greeting
     * 
     * @param scope to set
     */
    public void setGreeting(String value) {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        ((ConnectorConfig) connector.getConfig()).setGreeting(value);
    }

    /**
     * Retrieves greeting
     * 
     */
    public String getGreeting() {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return ((ConnectorConfig) connector.getConfig()).getGreeting();
    }

    /**
     * Sets reply
     * 
     * @param scope to set
     */
    public void setReply(String value) {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        ((ConnectorConfig) connector.getConfig()).setReply(value);
    }

    /**
     * Retrieves reply
     * 
     */
    public String getReply() {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) this.getDefaultUnauthorizedConnector());
        return ((ConnectorConfig) connector.getConfig()).getReply();
    }

    /**
     * Sets consumerKey
     * 
     * @param key to set
     */
    public void setConsumerKey(String value) {
        super.setConsumerKey(value);
    }

    /**
     * Sets consumerSecret
     * 
     * @param secret to set
     */
    public void setConsumerSecret(String value) {
        super.setConsumerSecret(value);
    }

    @Override
    protected OAuth2Adapter instantiateAdapter() {
        return new org.mule.modules.hybris.adapters.HybrisConnectorRestClientAdapter(this);
    }

    @Override
    protected KeyedPoolableObjectFactory createPoolFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        return new HybrisConnectorOAuthClientFactory(oauthManager, objectStore);
    }

    @Override
    protected void setCustomProperties(OAuth2Adapter adapter) {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) adapter);
        ((ConnectorConfig) connector.getConfig()).setGreeting(getGreeting());
        ((ConnectorConfig) connector.getConfig()).setReply(getReply());
        ((ConnectorConfig) connector.getConfig()).setConsumerKey(getConsumerKey());
        ((ConnectorConfig) connector.getConfig()).setConsumerSecret(getConsumerSecret());
    }

    protected void fetchCallbackParameters(OAuth2Adapter adapter, String response) {
        HybrisConnectorOAuth2Adapter connector = ((HybrisConnectorOAuth2Adapter) adapter);
        ExpressionManager expressionManager = (muleContext.getExpressionManager());
        MuleMessage muleMessage = new DefaultMuleMessage(response, (muleContext));
    }

    public void setOnNoToken(OnNoTokenPolicy policy) {
        this.getDefaultUnauthorizedConnector().setOnNoTokenPolicy(policy);
    }

    @Override
    protected Set<Class<? extends Exception>> refreshAccessTokenOn() {
        Set<Class<? extends Exception>> types = new HashSet<Class<? extends Exception>>();
        types.add(Exception.class);
        return types;
    }

}
