TYPE=VIEW
query=select cast(substr(`bdclick`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick`.`bdcuadre`.`Id` AS `Id`,`bdclick`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick`.`bdcuadre` left join `bdclick`.`primeroultimonc` on((`bdclick`.`bdcuadre`.`Id` = `bdclick`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick`.`bdcuadre`.`Id`,8,100) as signed),`bdclick`.`bdcuadre`.`Id`,`bdclick`.`primeroultimonc`.`primeroNc`,`bdclick`.`primeroultimonc`.`ultimoNc`,`bdclick`.`bdcuadre`.`primeraFactura`,`bdclick`.`bdcuadre`.`ultimaFactura`,`bdclick`.`bdcuadre`.`primerAbono`,`bdclick`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick`.`bdcuadre`.`Id`,8,100) as signed)
md5=4b420ff8a0258ebd5fbc8cef9e6e0aa4
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select cast(substr(`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdcuadre`.`Id` AS `Id`,`primeroultimonc`.`primeroNc` AS `primeroNc`,`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdcuadre`.`primerAbono` AS `primerAbono`,`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdcuadre` left join `primeroultimonc` on((`bdcuadre`.`Id` = `primeroultimonc`.`cuadre`))) group by cast(substr(`bdcuadre`.`Id`,8,100) as signed),`bdcuadre`.`Id`,`primeroultimonc`.`primeroNc`,`primeroultimonc`.`ultimoNc`,`bdcuadre`.`primeraFactura`,`bdcuadre`.`ultimaFactura`,`bdcuadre`.`primerAbono`,`bdcuadre`.`ultimoAbono` order by cast(substr(`bdcuadre`.`Id`,8,100) as signed)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select cast(substr(`bdclick`.`bdcuadre`.`Id`,8,100) as signed) AS `ordenId`,`bdclick`.`bdcuadre`.`Id` AS `Id`,`bdclick`.`primeroultimonc`.`primeroNc` AS `primeroNc`,`bdclick`.`primeroultimonc`.`ultimoNc` AS `ultimoNc`,`bdclick`.`bdcuadre`.`primeraFactura` AS `primeraFactura`,`bdclick`.`bdcuadre`.`ultimaFactura` AS `ultimaFactura`,`bdclick`.`bdcuadre`.`primerAbono` AS `primerAbono`,`bdclick`.`bdcuadre`.`ultimoAbono` AS `ultimoAbono` from (`bdclick`.`bdcuadre` left join `bdclick`.`primeroultimonc` on((`bdclick`.`bdcuadre`.`Id` = `bdclick`.`primeroultimonc`.`cuadre`))) group by cast(substr(`bdclick`.`bdcuadre`.`Id`,8,100) as signed),`bdclick`.`bdcuadre`.`Id`,`bdclick`.`primeroultimonc`.`primeroNc`,`bdclick`.`primeroultimonc`.`ultimoNc`,`bdclick`.`bdcuadre`.`primeraFactura`,`bdclick`.`bdcuadre`.`ultimaFactura`,`bdclick`.`bdcuadre`.`primerAbono`,`bdclick`.`bdcuadre`.`ultimoAbono` order by cast(substr(`bdclick`.`bdcuadre`.`Id`,8,100) as signed)
mariadb-version=100135
