<%@ include file="PharmacyHeader.jsp"%>

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
	<div class="row">
		<ol class="breadcrumb">
			<li><a href="#"><svg class="glyph stroked home">
						<use xlink:href="#stroked-home"></use></svg></a></li>
			<li class="active">Home</li>
		</ol>
	</div>
	<!--/.row-->

	<div class="row" style="padding-top: 20px;">
		<div class="col-lg-12">
			<!-- <h1 class="page-header">Widgets</h1> -->
		</div>
	</div>
	<!--/.row-->



	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<b>Add Medicine Here...</b>
				</div>

				<div style="color: #00b300; text-align: center; font-size: 15px;">${empadd}</div>
				<%
					session.removeAttribute("empadd");
				%>

				<div class="panel-body">
					<form class="form-horizontal" action="AddMedicineController"
						method="post">
						<fieldset>


							<!-- Name input-->
							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Medicine
									Company</label>
								<div class="col-md-6">
									<input id="name" name="mcompany" type="text"
										placeholder=" Abbott Laboratories" class="form-control">
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Medicine
									Name </label>
								<div class="col-md-6">
									<input id="name" name="mname" type="text"
										placeholder="Combiflam" class="form-control">
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Medicine
									Description</label>
								<div class="col-md-6">
									<input id="name" name="mdescription" type="text"
										placeholder="Descritption Here" class="form-control">
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Quantity</label>
								<div class="col-md-6">
									<input id="name" name="quantity" type="text" placeholder="10"
										class="form-control">
								</div>
							</div>


							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Price</label>
								<div class="col-md-6">
									<input id="name" name="price" type="text" placeholder="250.00"
										class="form-control">
								</div>
							</div>



							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Manufacturing
									Date</label>
								<div class="col-md-6">
									<input id="name" name="mdate" type="date" placeholder="04/2019"
										class="form-control">
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Expiry
									Date</label>
								<div class="col-md-6">
									<input id="name" name="edate" type="date" placeholder="08/2025"
										class="form-control">
								</div>
							</div>

							<!-- <div class="form-group">
								<label class="col-md-3 control-label" for="name">Medicine
									Category </label>
								<div class="col-md-4">
									<select name="category" class="form-control">
										<option>Tablet</option>
										<option>Capsule</option>
										<option>Syrub</option>
										<option>Injection</option>
										<option>Medical Equipment</option>
									</select>
								</div>
							</div> -->

							<!-- Form actions -->
							<div class="col-sm-04"></div>
							<div class="col-sm-04">
								<div class="form-group">
									<div class="col-md-6 widget-right">
										<input type="submit" value="Add Details"
											class="btn btn-default btn-md pull-right">
									</div>
								</div>
							</div>

						</fieldset>
					</form>
				</div>
			</div>
		</div>



	</div>
	<!--/.row-->
</div>
<!--/.main-->