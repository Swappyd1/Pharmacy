<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Pharmacy Dashboard</title>
<link href="css1/bootstrap-table.css" rel="stylesheet">
<link href="css1/bootstrap.min.css" rel="stylesheet">
<link href="css1/datepicker3.css" rel="stylesheet">
<link href="css1/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js1/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="PharmacyHeader.jsp"> <img
					alt="Logo" src="images/logo2.png" width="200" height="80"></a>
				<center>
					<strong style="font-size: 30px; color: white;"><b>Pharmacy
							Management System</b></strong>
				</center>

				<ul class="user-menu">
					<li class="dropdown pull-right"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"><svg
								class="glyph stroked male-user">
								<use xlink:href="#stroked-male-user"></use></svg> Admin <span
							class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">

							<!-- <li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Settings</a></li> -->
							<li><a href="index.html"><svg
										class="glyph stroked cancel">
										<use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul></li>
				</ul>
			</div>

		</div>
		<!-- /.container-fluid -->
	</nav>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<table class="Responsive">
			<form role="search">
				<div id="search_manage">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
				</div>
			</form>
		</table>
		<ul class="nav menu">
			<li class="active"><a href="PharmacyDashboard.jsp"><svg
						class="glyph stroked dashboard-dial">
						<use xlink:href="#stroked-dashboard-dial"></use></svg>Dashboard</a></li>
			<li><a href="addmedicine.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>Add Medicines</a></li>
			<li><a href="viewallmedicines.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>View All Medicines</a></li>

			<li><a href="addsupplier.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>Add Supplier</a></li>
			<li><a href="viewallsupplier.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>View All Supplier</a></li>
			<li><a href="addcustomer.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>Add Customer</a></li>
			<li><a href="sellmedicine.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>Sell Medicine</a></li>
			<li><a href="generateinvoice.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>Generate Invoice</a></li>
			<li><a href="viewcustomer.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>View Customer</a></li>


			<li><a href="viewallmessages.jsp"><svg
						class="glyph stroked table">
						<use xlink:href="#stroked-table"></use></svg>View Messages</a></li>
			<!-- <li><a href="selectmedicine.jsp"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Select Medicine</a></li> -->


		</ul>
		<div class="row">
			<div class="attribution">
				Developed by <a href="http://www.maxgentechnology.com/portfolio.php">Maxgen
					Technology</a><br />
			</div>
		</div>
	</div>

	<!--/.sidebar-->



	<script src="js1/jquery-1.11.1.min.js"></script>
	<script src="js1/bootstrap.min.js"></script>
	<script src="js1/chart.min.js"></script>
	<script src="js1/chart-data.js"></script>
	<script src="js1/easypiechart.js"></script>
	<script src="js1/easypiechart-data.js"></script>
	<script src="js1/bootstrap-datepicker.js"></script>
	<script src="js1/bootstrap-table.js"></script>
	<script>
		$('#calendar').datepicker({});

		!function($) {
			$(document)
					.on(
							"click",
							"ul.nav li.parent > a > span.icon",
							function() {
								$(this).find('em:first').toggleClass(
										"glyphicon-minus");
							});
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function() {
			if ($(window).width() > 768)
				$('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function() {
			if ($(window).width() <= 767)
				$('#sidebar-collapse').collapse('hide')
		})
	</script>
</body>

</html>
