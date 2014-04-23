/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.testsuites;

import junit.framework.*;
import org.gridgain.grid.kernal.processors.cache.distributed.dht.*;
import org.gridgain.grid.kernal.processors.cache.distributed.near.*;
import org.gridgain.grid.kernal.processors.cache.distributed.replicated.*;

/**
 * Test suite for near-only cache.
 */
public class GridCacheNearOnlySelfTestSuite {
    /**
     * @return Suite.
     * @throws Exception If failed.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("Gridgain near-only cache test suite.");

        suite.addTest(new TestSuite(GridCacheNearOnlySelfTest.class));
        suite.addTest(new TestSuite(GridCacheAtomicNearOnlySelfTest.class));
        suite.addTest(new TestSuite(GridCacheClientOnlySelfTest.class));
        suite.addTest(new TestSuite(GridCacheNearOnlyTopologySelfTest.class));
        suite.addTest(new TestSuite(GridCacheReplicatedClientOnlySelfTest.class));
        suite.addTest(new TestSuite(GridCacheReplicatedNearOnlySelfTest.class));

        return suite;
    }
}