package com.lithium.integrations.model;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class TopicMessages {

	private List<String> messages;

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public TopicMessages() {
		messages = new ArrayList<String>();

	}

	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(TopicMessages.class);

		TopicMessages customer = new TopicMessages();
		customer.getMessages().add("janed@example.com");
		customer.getMessages().add("jdoe@example.org");

		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(customer, System.out);
	}
}
