package com.geopagos.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.geopagos.dao.ConnectionGeopagosDatabase;
import com.geopagos.model.GeometricFigure;
import com.geopagos.model.Square;
import com.google.gson.Gson;

/***
 * 
 * @author user A A Berlot
 * 29/03/2018
 *
 */

@Path("/geometric")
public class GeometricFigureController {

	@Path("/selectFigure")
	@POST
	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	public String geometricMesures(@FormParam("geometricFigure") String geometricFigure) {

		String response = "You select a ";

		try {
			if (geometricFigure.equals("Circle")) {
				response = response.concat("Circle");
			} else if (geometricFigure.equals("Square")) {
				response = response.concat("Square");
			} else if (geometricFigure.equals("Triangle")) {
				response = response.concat("Triangle");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getCause().getMessage());
		}
		return response;
	}

	/* Register endpoint */
	@Path("/messures")
	@POST
	public String registerMessures(@FormParam("height") Double height, @FormParam("width") Double width, @FormParam("surface") Double surface, @FormParam("diameter") Double diameter, @FormParam("type") String type) throws Exception {
		String response;
		Connection connect;
		try {
			ConnectionGeopagosDatabase c = new ConnectionGeopagosDatabase();
			connect = c.connectNow();

			if (connect != null) {
				String sql = "INSERT INTO geometric_figure(height, width, surface, diameter, type) VALUES(?,?,?,?,?)";
				PreparedStatement ps = connect.prepareStatement(sql);
				ps.setDouble(1, height);
				ps.setDouble(2, width);
				ps.setDouble(3, surface);
				ps.setDouble(4, diameter);
				ps.setString(5, type);
				ps.execute();
				ps.close();
				response = "Connection stablished";
			} else {
				response = "Connection appears to be null.";
			}
		} catch (Exception ex) {
			response = "Something is wrong with data base - " + ex.getMessage();
		}
		return response;
	}
	
	/* Endpoint select */
	@Path("/getAllMessures")
	@POST
	@Produces("application/json")
	@Consumes("application/x-www-form-urlencoded")
	public String getAllMessures() {
		String response;
		List<GeometricFigure> list = new ArrayList<>();
		Gson gson = new Gson();
		Connection connect;
		Double height = null;
		Double width = null;
		Double surface = null;
		Double diameter = null;
		String type = null;
		
		try {
			ConnectionGeopagosDatabase c = new ConnectionGeopagosDatabase();
			connect = c.connectNow();
			if(connect != null) {
				String sql = "SELECT height, width, surface, diameter, type FROM geometric_figure";
				Statement st = connect.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					height = rs.getDouble("height");
					width = rs.getDouble("width");
					surface = rs.getDouble("surface");
					diameter = rs.getDouble("diameter");
					type = rs.getString("type");
					list.add(new Square(height, width, surface, diameter, type));
				}
				response = gson.toJson(list);
			}else {
				response = "Connection appears to be null";
			}
		}catch(Exception ex) {
			response = "Something is wrong with the Data Base -" + ex.getMessage();
		}
		return response;
	}
	

}
