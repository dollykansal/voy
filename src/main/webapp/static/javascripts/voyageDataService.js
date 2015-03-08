var VoyageDataService = function(){
	this.getVesselMaster = function(){
		$.getJSON('http://localhost:8080/voyage/vesselMaster', function(data) {
			console.log(">>",data);
			sap.ui.getCore().getModel("vesselMaster").setData(data);
		});
	}
}
window.dataService = new VoyageDataService();