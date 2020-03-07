package com.bhavesh.aerospikeexample.repository;
import com.bhavesh.aerospikeexample.model.LivePrice;
import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivePriceRepository extends AerospikeRepository<LivePrice, String>{
}
