<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Struts2 Showcase - UI Tags - Optiontransferselect</title>
<s:head />
</head>
<body>
	<div class="page-header">
		<h1>UI Tags - Optiontransferselect</h1>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">

				<s:form action="lotsOfOptiontransferselectSubmit"
					namespace="/tags/ui" method="post">
					<s:optiontransferselect
						tooltip="Select Your Favourite Cartoon Characters" headerKey="-1"
						headerValue="--- Please Select ---" doubleHeaderKey="-1"
						doubleHeaderValue="--- Please Select ---" emptyOption="true"
						doubleEmptyOption="true" label="Favourite Cartoon Characters"
						leftTitle="Favourite Cartoon Characters"
						rightTitle="Non Favourite Cartoon Characters"
						name="favouriteCartoonCharacters"
						list="defaultFavouriteCartoonCharacters"
						doubleName="notFavouriteCartoonCharacters"
						doubleList="defaultNotFavouriteCartoonCharacters" />

					<br />

					<s:optiontransferselect tooltip="Select Your Favourite Cars"
						headerKey="-1" headerValue="--- Please Select ---"
						doubleHeaderKey="-1" doubleHeaderValue="--- Please Select ---"
						emptyOption="true" doubleEmptyOption="true" label="Favourite Cars"
						leftTitle="Favourite Cars" rightTitle="Non Favourite Cars"
						name="favouriteCars" list="defaultFavouriteCars"
						doubleName="notFavouriteCars" doubleList="defaultNotFavouriteCars" />

					<br />

					<s:optiontransferselect tooltip="Select Your Favourite Motorcycles"
						headerKey="-1" headerValue="--- Please Select ---"
						doubleHeaderKey="-1" doubleHeaderValue="--- Please Select ---"
						emptyOption="true" doubleEmptyOption="true"
						label="Favourite Motorcycles" leftTitle="Favourite Motorcycles"
						rightTitle="Non Favourite Motorcycles" name="favouriteMotorcycles"
						list="defaultFavouriteMotorcycles"
						doubleName="notFavouriteMotorcycles"
						doubleList="defaultNotFavouriteMotorcycles" />

					<br />

					<s:optiontransferselect tooltip="Select Your Favourite Countries"
						headerKey="-1" headerValue="--- Please Select ---"
						doubleHeaderKey="-1" doubleHeaderValue="--- Please Select ---"
						emptyOption="true" doubleEmptyOption="true"
						label="Favourite Countries" leftTitle="Favourite Countries"
						rightTitle="Non Favourite Countries" name="favouriteCountries"
						list="defaultFavouriteCountries"
						doubleName="notFavouriteCountries"
						doubleList="defaultNotFavouriteCountries" />

					<br />
					
					<s:optiontransferselect tooltip="Select Your Favourite Cities"
						headerKey="-1" headerValue="--- Please Select ---"
						doubleHeaderKey="-1" doubleHeaderValue="--- Please Select ---"
						emptyOption="true" doubleEmptyOption="true"
						label="Favourite Cities" leftTitle="Favourite Cities"
						rightTitle="Non Favourite Cities" name="favouriteCities"
						list="defaultFavouriteCities"
						doubleName="notFavouriteCities"
						doubleList="defaultNotFavouriteCities" />

					<br />

					<s:optiontransferselect tooltip="Pick One at a Time"
						label="Favourite Sport" leftTitle="Favourite Sports"
						rightTitle="Not Favourite Sports" name="favouriteSports"
						list="defaultFavoriteSports" doubleName="nonFavouriteSports"
						doubleList="defaultNonFavouriteSports" size="1" multiple="false"
						doubleSize="5" doubleMultiple="true" allowAddAllToLeft="false"
						allowAddAllToRight="false" allowSelectAll="false" />
					<br />

					<s:submit value="Submit It" />
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>