package esnerda.keboola.ex.appnexus.config;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import esnerda.keboola.components.appstate.LastState;

/**
 * @author David Esner
 */
public class AppNexusState implements LastState {
	@JsonProperty("lastRun")
	private LocalDateTime lastRun;

	@JsonProperty("unfinishedJobs")
	private List unfinishedJobs;

	@JsonProperty("lastConfig")
	private AppNexusProperties lastConfig;

	public AppNexusState(LocalDateTime lastRun, List unfinishedJobs, AppNexusProperties lastConfig) {
		super();
		this.lastRun = lastRun;
		this.unfinishedJobs = unfinishedJobs;
		this.lastConfig = lastConfig;
	}

	public AppNexusState() {
	}

	public LocalDateTime getLastRun() {
		return lastRun;
	}

	public List getUnfinishedJobs() {
		return unfinishedJobs;
	}

	public void setUnfinishedJobs(List unfinishedJobs) {
		this.unfinishedJobs = unfinishedJobs;
	}

	public void setLastRun(LocalDateTime lastRun) {
		this.lastRun = lastRun;
	}

	public AppNexusProperties getLastConfig() {
		return lastConfig;
	}
	
	
}
