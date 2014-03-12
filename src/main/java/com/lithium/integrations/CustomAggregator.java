package com.lithium.integrations;

import java.util.Map;

import org.mule.api.MuleContext;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.routing.AbstractAggregator;
import org.mule.routing.correlation.EventCorrelatorCallback;
import org.mule.transformer.AbstractMessageTransformer;

public class CustomAggregator extends AbstractAggregator {

	@Override
	protected EventCorrelatorCallback getCorrelatorCallback(MuleContext muleContext) {
		// TODO Auto-generated method stub
		System.out.println("Custom Aggregator. " + muleContext);
		EventCorrelatorCallback callback = getCorrelatorCallback(muleContext);
		return callback;
	}
}
