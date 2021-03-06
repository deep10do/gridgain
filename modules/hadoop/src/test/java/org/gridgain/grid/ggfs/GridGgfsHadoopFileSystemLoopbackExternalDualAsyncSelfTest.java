/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.ggfs;

import static org.gridgain.grid.ggfs.GridGgfsMode.*;

/**
 * GGFS Hadoop file system IPC loopback self test in DUAL_ASYNC mode.
 */
public class GridGgfsHadoopFileSystemLoopbackExternalDualAsyncSelfTest extends
    GridGgfsHadoopFileSystemLoopbackAbstractSelfTest {
    /**
     * Constructor.
     */
    public GridGgfsHadoopFileSystemLoopbackExternalDualAsyncSelfTest() {
        super(DUAL_ASYNC, true);
    }
}
