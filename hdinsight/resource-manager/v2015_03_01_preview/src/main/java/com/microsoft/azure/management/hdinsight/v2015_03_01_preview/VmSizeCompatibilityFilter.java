/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The virtual machine type compatibility filter.
 */
public class VmSizeCompatibilityFilter {
    /**
     * The mode for the filter.
     */
    @JsonProperty(value = "FilterMode")
    private String filterMode;

    /**
     * The list of regions.
     */
    @JsonProperty(value = "Regions")
    private List<String> regions;

    /**
     * The list of cluster types available.
     */
    @JsonProperty(value = "ClusterFlavors")
    private List<String> clusterFlavors;

    /**
     * The list of node types.
     */
    @JsonProperty(value = "NodeTypes")
    private List<String> nodeTypes;

    /**
     * The list of cluster versions.
     */
    @JsonProperty(value = "ClusterVersions")
    private List<String> clusterVersions;

    /**
     * The list of virtual machine sizes.
     */
    @JsonProperty(value = "vmsizes")
    private List<String> vmsizes;

    /**
     * Get the mode for the filter.
     *
     * @return the filterMode value
     */
    public String filterMode() {
        return this.filterMode;
    }

    /**
     * Set the mode for the filter.
     *
     * @param filterMode the filterMode value to set
     * @return the VmSizeCompatibilityFilter object itself.
     */
    public VmSizeCompatibilityFilter withFilterMode(String filterMode) {
        this.filterMode = filterMode;
        return this;
    }

    /**
     * Get the list of regions.
     *
     * @return the regions value
     */
    public List<String> regions() {
        return this.regions;
    }

    /**
     * Set the list of regions.
     *
     * @param regions the regions value to set
     * @return the VmSizeCompatibilityFilter object itself.
     */
    public VmSizeCompatibilityFilter withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Get the list of cluster types available.
     *
     * @return the clusterFlavors value
     */
    public List<String> clusterFlavors() {
        return this.clusterFlavors;
    }

    /**
     * Set the list of cluster types available.
     *
     * @param clusterFlavors the clusterFlavors value to set
     * @return the VmSizeCompatibilityFilter object itself.
     */
    public VmSizeCompatibilityFilter withClusterFlavors(List<String> clusterFlavors) {
        this.clusterFlavors = clusterFlavors;
        return this;
    }

    /**
     * Get the list of node types.
     *
     * @return the nodeTypes value
     */
    public List<String> nodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Set the list of node types.
     *
     * @param nodeTypes the nodeTypes value to set
     * @return the VmSizeCompatibilityFilter object itself.
     */
    public VmSizeCompatibilityFilter withNodeTypes(List<String> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }

    /**
     * Get the list of cluster versions.
     *
     * @return the clusterVersions value
     */
    public List<String> clusterVersions() {
        return this.clusterVersions;
    }

    /**
     * Set the list of cluster versions.
     *
     * @param clusterVersions the clusterVersions value to set
     * @return the VmSizeCompatibilityFilter object itself.
     */
    public VmSizeCompatibilityFilter withClusterVersions(List<String> clusterVersions) {
        this.clusterVersions = clusterVersions;
        return this;
    }

    /**
     * Get the list of virtual machine sizes.
     *
     * @return the vmsizes value
     */
    public List<String> vmsizes() {
        return this.vmsizes;
    }

    /**
     * Set the list of virtual machine sizes.
     *
     * @param vmsizes the vmsizes value to set
     * @return the VmSizeCompatibilityFilter object itself.
     */
    public VmSizeCompatibilityFilter withVmsizes(List<String> vmsizes) {
        this.vmsizes = vmsizes;
        return this;
    }

}
