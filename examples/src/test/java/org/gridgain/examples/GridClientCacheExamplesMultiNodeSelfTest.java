/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.examples;

/**
 * GridClientCacheExample multi-node self test.
 */
public class GridClientCacheExamplesMultiNodeSelfTest extends GridClientCacheExamplesSelfTest {
    /** {@inheritDoc} */
    @Override protected void beforeTest() throws Exception {
        for (int i = 0; i < RMT_NODES_CNT; i++)
            startGrid("node-" + i, "examples/config/example-cache.xml");
    }
}
