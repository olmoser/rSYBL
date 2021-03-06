/** 
   Copyright 2013 Technische Universitat Wien (TUW), Distributed SystemsGroup E184.                 This work was partially supported by the European Commission in terms of the CELAR FP7 project (FP7-ICT-2011-8 #317790).

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
package at.ac.tuwien.dsg.rSybl.dataProcessingUnit.monitoringPlugins.management;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import at.ac.tuwien.dsg.csdg.Node;
import at.ac.tuwien.dsg.csdg.elasticityInformation.ElasticityRequirement;
import at.ac.tuwien.dsg.rSybl.dataProcessingUnit.monitoringPlugins.interfaces.MonitoringInterface;



public class OfferedMonitoringMetrics implements MonitoringInterface{
	ManageMonitoringPlugins manageMonitoringPlugins = new ManageMonitoringPlugins();
	Node cloudService;
	public OfferedMonitoringMetrics(Node cloudService){
		this.cloudService=cloudService;
	}
	public void callSpecializedMethod(Node method, Node parameter){
		
	}
	

    public float getCpuUsage(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getCpuUsage")){
				 result = methods.get(method).getCpuUsage(string);
			}
		}
		
    	return result;
    }
    public float getMemoryAvailable(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getMemoryAvailable")){
				 result = methods.get(method).getMemoryAvailable(string);
			}
		}
		
    	return result;
    }
    public float getMemorySize(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getMemorySize")){
				 result = methods.get(method).getMemorySize(string);
			}
		}
		
    	return result;
    }
    public float getMemoryUsage(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getMemoryUsage")){
				 result = methods.get(method).getMemoryUsage(string);
			}
		}
		
    	return result;
    }   
    public float getDiskSize(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getDiskSize")){
				 result = methods.get(method).getDiskSize(string);
			}
		}
		
    	return result;
    }
    
    public float getDiskAvailable(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getDiskAvailable")){
				 result = methods.get(method).getDiskAvailable(string);
			}
		}
		
    	return result;    }
    public float getDiskUsage(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getDiskUsage")){
				 result = methods.get(method).getDiskUsage(string);
			}
		}
		
    	return result;    }
    public float getCPUSpeed(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getCPUSpeed")){
				 result = methods.get(method).getCPUSpeed(string);
			}
		}
		
    	return result;    }
    public float getPkts(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getPkts")){
				 result = methods.get(method).getPkts(string);
			}
		}
		
    	return result;    }
    public float getPktsIn(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getPktsIn")){
				 result = methods.get(method).getPktsIn(string);
			}
		}
		
    	return result;    }
    public float getPktsOut(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getPktsOut")){
				 result = methods.get(method).getPktsOut(string);
			}
		}
		
    	return result;    }
    public float getReadLatency(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getReadLatency")){
				 result = methods.get(method).getReadLatency(string);
			}
		}
		
    	return result;    }
    public float getWriteLatency(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getWriteLatency")){
				 result = methods.get(method).getWriteLatency(string);
			}
		}
		
    	return result;    }
    public float getReadCount(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getReadCount")){
				 result = methods.get(method).getReadCount(string);
			}
		}
		
    	return result;    }

    public float getWriteCount(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getWriteCount")){
				 result = methods.get(method).getWriteCount(string);
			}
		}
		
    	return result;    }
    public float getCostPerHour(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){

			if (method.getName().equalsIgnoreCase("getCostPerHour")){
				 result = methods.get(method).getCostPerHour(string);
			}
		}
		
    	return result;
    }

    public float getTotalCostSoFar(Node string){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("getTotalCostSoFar")){
				 result = methods.get(method).getTotalCostSoFar(string);
			}
		}
		
    	return result;
    }
    public List<String> getAvailableMetrics(){
    	List<String> metricsAvailable = new ArrayList<String>();
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("getAvailableMetrics")){
				metricsAvailable = methods.get(method).getAvailableMetrics();
			}
		}
    	return metricsAvailable;
    }
    
    public float getMetricValue(String metricName, Node node){
    	Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("getMetricValue")){
				 result = methods.get(method).getMetricValue(metricName,node);
			}
		}
		
    	return result;    }
	public void notifyControlActionStarted(String actionName, Node e) {
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("notifyControlActionStarted")){
				 methods.get(method).notifyControlActionStarted(actionName,e);
			}
		}
		
    			
	}
	public void notifyControlActionEnded(String actionName,Node e) {
		Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("notifyControlActionEnded")){
				 methods.get(method).notifyControlActionEnded(actionName, e);
			}
		}		
	}
	@Override
	public void submitServiceConfiguration(Node cloudService) {
		Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("submitServiceConfiguration")){
				 methods.get(method).submitServiceConfiguration(cloudService);
			}
		}	
		
	}
	
	@Override
	public void submitElasticityRequirements(
			ArrayList<ElasticityRequirement> description) {
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("submitElasticityRequirements")){
				  methods.get(method).submitElasticityRequirements(description);
			}
		}
	}
	@Override
	public float getNumberInstances(Node string) {
		Float result = 0.0f;
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("getNumberInstances")){
				 result = methods.get(method).getNumberInstances(string);
			}
		}
		return result;
	}
	@Override
	public void refreshServiceStructure(Node node) {
    	Map<Method,MonitoringInterface> methods = manageMonitoringPlugins.getMethods(manageMonitoringPlugins.getAllPlugins(cloudService));
		for (Method method:methods.keySet()){
			if (method.getName().equalsIgnoreCase("refreshServiceStructure")){
				  methods.get(method).refreshServiceStructure(node);
			}
		}
	}

}
