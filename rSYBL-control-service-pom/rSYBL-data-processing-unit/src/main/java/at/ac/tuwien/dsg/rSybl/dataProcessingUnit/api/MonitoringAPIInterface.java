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
package at.ac.tuwien.dsg.rSybl.dataProcessingUnit.api;

import java.util.ArrayList;

import at.ac.tuwien.dsg.csdg.Node;
import at.ac.tuwien.dsg.csdg.elasticityInformation.ElasticityRequirement;



public interface MonitoringAPIInterface {
    
	public Float getCurrentCPUSize(Node e)  ;
    
	public Float getCostPerHour(Node e)  ;
    	
	public Float getCurrentRAMSize(Node e) ;
    
   
    public Float getCurrentMemUsage(Node e);
    
	public Float getTotalCostSoFar(Node e) ;

    
	public Node getControlledService() ;
    
	public void setControlledService(Node controlledService) ;
    
	public Float getCurrentReadLatency(Node e)  ;
    
	public Float getCurrentReadCount(Node e)  ;
    
    public Float getCurrentWriteLatency(Node e)  ;
    
	public Float getCurrentWriteCount(Node e)  ;
    public Float getMetricValue(String metricName, Node e);
	public Float getCurrentCPUUsage(Node e) ;
    public void submitElasticityRequirements(ArrayList<ElasticityRequirement> description);
	public Float getCurrentHDDSize(Node e)  ; 
    
	public void scaleinstarted(Node arg0);
	public void scaleinended(Node arg0);

    
	public void scaleoutstarted(Node arg0);
	public void scaleoutended(Node arg0);
   	
	public Float getCurrentLatency(Node arg0)  ;

    
	public Float getCurrentOperationCount(Node arg0);

    
	public Float getCurrentHDDUsage(Node e) ;
    public void enforcingActionStarted(String actionName, Node e);
    public void enforcingActionEnded(String actionName, Node e);

    public Float getNumberInstances(Node e);
    public void refreshServiceStructure(Node cloudService);
}
