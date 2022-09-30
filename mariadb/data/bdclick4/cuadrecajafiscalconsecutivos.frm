TYPE=VIEW
query=select cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick4`.`bdcuadre`.`Id` AS `Id`,`bdclick4`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick4`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick4`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick4`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick4`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick4`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick4`.`bdcuadre` left join `bdclick4`.`primeroultimonc` on((`bdclick4`.`bdcuadre`.`Id` = `bdclick4`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed),`bdclick4`.`bdcuadre`.`Id`,`bdclick4`.`primeroultimonc`.`primeroNc`,`bdclick4`.`primeroultimonc`.`ultimoNc`,`bdclick4`.`bdcuadre`.`primeraFactura`,`bdclick4`.`bdcuadre`.`ultimaFactura`,`bdclick4`.`bdcuadre`.`primerAbono`,`bdclick4`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed)
md5=2fa4c8e4022e6740e9f60481731974ea
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:27
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick4`.`bdcuadre`.`Id` AS `Id`,`bdclick4`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick4`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick4`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick4`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick4`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick4`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick4`.`bdcuadre` left join `bdclick4`.`primeroultimonc` on((`bdclick4`.`bdcuadre`.`Id` = `bdclick4`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed),`bdclick4`.`bdcuadre`.`Id`,`bdclick4`.`primeroultimonc`.`primeroNc`,`bdclick4`.`primeroultimonc`.`ultimoNc`,`bdclick4`.`bdcuadre`.`primeraFactura`,`bdclick4`.`bdcuadre`.`ultimaFactura`,`bdclick4`.`bdcuadre`.`primerAbono`,`bdclick4`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick4`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
