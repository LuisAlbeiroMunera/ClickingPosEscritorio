TYPE=VIEW
query=select cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick6`.`bdcuadre`.`Id` AS `Id`,`bdclick6`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick6`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick6`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick6`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick6`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick6`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick6`.`bdcuadre` left join `bdclick6`.`primeroultimonc` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed),`bdclick6`.`bdcuadre`.`Id`,`bdclick6`.`primeroultimonc`.`primeroNc`,`bdclick6`.`primeroultimonc`.`ultimoNc`,`bdclick6`.`bdcuadre`.`primeraFactura`,`bdclick6`.`bdcuadre`.`ultimaFactura`,`bdclick6`.`bdcuadre`.`primerAbono`,`bdclick6`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed)
md5=a6092c732c4d3bc11377f70d1fd4ff01
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick6`.`bdcuadre`.`Id` AS `Id`,`bdclick6`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick6`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick6`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick6`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick6`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick6`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick6`.`bdcuadre` left join `bdclick6`.`primeroultimonc` on((`bdclick6`.`bdcuadre`.`Id` = `bdclick6`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed),`bdclick6`.`bdcuadre`.`Id`,`bdclick6`.`primeroultimonc`.`primeroNc`,`bdclick6`.`primeroultimonc`.`ultimoNc`,`bdclick6`.`bdcuadre`.`primeraFactura`,`bdclick6`.`bdcuadre`.`ultimaFactura`,`bdclick6`.`bdcuadre`.`primerAbono`,`bdclick6`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick6`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
