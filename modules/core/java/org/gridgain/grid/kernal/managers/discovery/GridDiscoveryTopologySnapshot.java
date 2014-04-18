/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.managers.discovery;

import org.gridgain.grid.*;
import org.gridgain.grid.util.typedef.internal.*;
import org.gridgain.grid.util.tostring.*;

import java.util.*;

/**
 * Topology snapshot managed by discovery manager.
 */
public class GridDiscoveryTopologySnapshot {
    /** Topology version. */
    private long topVer;

    /** Topology nodes. */
    @GridToStringInclude
    private Collection<GridNodeShadow> topNodes;

    /**
     * Creates a topology snapshot with given topology version and topology nodes.
     *
     * @param topVer Topology version.
     * @param topNodes Topology nodes.
     */
    public GridDiscoveryTopologySnapshot(long topVer, Collection<GridNodeShadow> topNodes) {
        this.topVer = topVer;
        this.topNodes = topNodes;
    }

    /** {@inheritDoc} */
    public long topologyVersion() {
        return topVer;
    }

    /** {@inheritDoc} */
    public Collection<GridNodeShadow> topologyNodes() {
        return topNodes;
    }

    /** {@inheritDoc} */
    @Override public String toString() {
        return S.toString(GridDiscoveryTopologySnapshot.class, this);
    }
}