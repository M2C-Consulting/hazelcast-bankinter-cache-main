package com.hazelcast;

import java.util.Map;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

public class Main {

	public static void main(String[] args) throws Exception {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getNetworkConfig().addAddress("hz-hazelcast");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);

		// Common data map
		Map<CacheKey, String> commonMessages = client.getMap("commonMessages");
		
		// Map load
		for (int i=0; i <22000; i++) {
			CacheKey temp = new CacheKey("1234", "123", i, "12345", "123", "123");
			commonMessages.put(temp, "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890//"+i);
		}

		System.out.println("Map size: " + commonMessages.size());
		client.shutdown();
	}
}
