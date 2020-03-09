package com.bhavesh.aerospikeexample.config;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.ClientPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.core.AerospikeTemplate;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAerospikeRepositories(basePackages = "com.bhavesh.aerospikeexample.repository")
public class AerospikeConfig<destroyMethod> {

    @Bean
    public AerospikeTemplate aerospikeTemplate() {
        return new AerospikeTemplate(aerospikeClient(), "test");
    }

    @Bean(destroyMethod = "close")
    public AerospikeClient aerospikeClient() {
        ClientPolicy clientPolicy = new ClientPolicy();
        clientPolicy.failIfNotConnected = true;
        //return new AerospikeClient(clientPolicy,  "192.168.168.58", 3000);
        return new AerospikeClient(clientPolicy,  "192.168.99.101", 3000);
    }

}
