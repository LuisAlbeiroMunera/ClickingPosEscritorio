TYPE=VIEW
query=select cast(substr(`bdclick1`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick1`.`bdcuadre`.`Id` AS `Id`,`bdclick1`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick1`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick1`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick1`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick1`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick1`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick1`.`bdcuadre` left join `bdclick1`.`primeroultimonc` on((`bdclick1`.`bdcuadre`.`Id` = `bdclick1`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick1`.`bdcuadre`.`Id`,8,100) as signed),`bdclick1`.`bdcuadre`.`Id`,`bdclick1`.`primeroultimonc`.`primeroNc`,`bdclick1`.`primeroultimonc`.`ultimoNc`,`bdclick1`.`bdcuadre`.`primeraFactura`,`bdclick1`.`bdcuadre`.`ultimaFactura`,`bdclick1`.`bdcuadre`.`primerAbono`,`bdclick1`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick1`.`bdcuadre`.`Id`,8,100) as signed)
md5=cff5848d6b877102ae50114c07497882
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:34
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick1`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick1`.`bdcuadre`.`Id` AS `Id`,`bdclick1`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick1`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick1`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick1`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick1`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick1`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick1`.`bdcuadre` left join `bdclick1`.`primeroultimonc` on((`bdclick1`.`bdcuadre`.`Id` = `bdclick1`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick1`.`bdcuadre`.`Id`,8,100) as signed),`bdclick1`.`bdcuadre`.`Id`,`bdclick1`.`primeroultimonc`.`primeroNc`,`bdclick1`.`primeroultimonc`.`ultimoNc`,`bdclick1`.`bdcuadre`.`primeraFactura`,`bdclick1`.`bdcuadre`.`ultimaFactura`,`bdclick1`.`bdcuadre`.`primerAbono`,`bdclick1`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick1`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
