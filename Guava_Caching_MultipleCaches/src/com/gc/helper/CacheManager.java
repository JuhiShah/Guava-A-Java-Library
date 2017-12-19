package com.gc.helper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheManager {

	@SuppressWarnings("rawtypes")
	static Map<String, LoadingCache<String, List>> cacheMap = new HashMap<String, LoadingCache<String, List>>();;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void loadCache(String mapKey, CacheLoader cacheLoader) {

		LoadingCache<String, List> cache = CacheBuilder.newBuilder().expireAfterAccess(10, TimeUnit.MINUTES)
				.build(cacheLoader);
		cacheMap.put(mapKey, cache);
	}

	@SuppressWarnings("rawtypes")
	public static List getData(String mapKey, String cacheKey) {

		try {
			return cacheMap.get(mapKey).get(cacheKey);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}
}