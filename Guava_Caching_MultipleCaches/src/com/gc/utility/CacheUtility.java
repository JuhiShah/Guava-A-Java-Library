package com.gc.utility;

import java.util.List;

import com.gc.dao.GuavaDao;
import com.google.common.cache.CacheLoader;

public class CacheUtility {

	static GuavaDao dao = new GuavaDao();
	
	@SuppressWarnings("rawtypes")
	public static CacheLoader getCacheLoader(String cacheKey){
		CacheLoader<String, List> ucacheLoader = new CacheLoader<String, List>(){
			@SuppressWarnings("static-access")
			@Override
			public List load(String key) throws Exception {
				return dao.getListByKey(key);
			}
		};
		return ucacheLoader;
	}
}
